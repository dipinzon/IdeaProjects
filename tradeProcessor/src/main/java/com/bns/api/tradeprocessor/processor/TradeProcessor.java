package com.bns.api.tradeprocessor.processor;

import com.bns.api.tradeprocessor.config.SecurityId;
import com.bns.api.tradeprocessor.model.Message;
import com.bns.api.tradeprocessor.model.TradeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

@Component
public class TradeProcessor {

    private final KafkaTemplate<String, TradeMessage> kafkaTemplate;
    private final RestTemplate restTemplate;

    @Autowired
    public TradeProcessor(KafkaTemplate<String, TradeMessage> kafkaTemplate, RestTemplate restTemplate) {
        this.kafkaTemplate = kafkaTemplate;
        this.restTemplate = restTemplate;
    }

     /**
     * Handles incoming FIX messages.
     */
    public void onMessage(Message msg) {
        // Calling to convertToTradeMessage
        TradeMessage tradeMessage = convertToTradeMessage(msg);
        if (tradeMessage != null) {
            kafkaTemplate.sendDefault(tradeMessage.getTradeId(), tradeMessage); /** Send message to kafka*/
        }
    }

    private TradeMessage convertToTradeMessage(Message msg) {
        // Create a TradeMessage instance
        TradeMessage tradeMessage = new TradeMessage();
        tradeMessage.setTradeId(msg.getString(17));
        tradeMessage.setSecurityId(msg.getString(48));
        tradeMessage.setIdSource(TradeMessage.IdSource.valueOf(msg.getString(22)));
        tradeMessage.setAccount(msg.getString(1));
        tradeMessage.setQty(msg.getInt(32)); //lastShares
        tradeMessage.setPrice(msg.getDouble(6));

        // Fetch security details from the security master endpoint
        // Calling exchange method that allows you to send an HTTP request and receive an HTTP response
        ResponseEntity<SecurityId> response = restTemplate.exchange(
                "https://sec-master.bns/find",
                HttpMethod.POST,
                new HttpEntity<>(new SecurityId(msg.getString(48))),
                SecurityId.class
        );

        // Get the details from the response entity
        SecurityId securityDetails = response.getBody();

        // Populate security details into the TradeMessage
        if (securityDetails != null) {

            tradeMessage.setTicker(securityDetails.getTicker()); //Side

            /** fields like ISIN, SEDOL, CUSIP, etc. based on idSource*/
            if (tradeMessage.getIdSource() != null) {
                switch (tradeMessage.getIdSource()) {
                    case ISIN:
                        tradeMessage.setIsin(securityDetails.getIsin());
                        break;
                    case SEDOL:
                        tradeMessage.setSedol(securityDetails.getSedol());
                        break;
                    case CUSIP:
                        tradeMessage.setCusip(securityDetails.getCusip());
                        break;
                    case RIC:
                        tradeMessage.setRic(securityDetails.getRic());
                        break;
                }
            }
        }
        return tradeMessage;
    }

}
