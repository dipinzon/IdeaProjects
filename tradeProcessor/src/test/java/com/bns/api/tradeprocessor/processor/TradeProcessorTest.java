package com.bns.api.tradeprocessor.processor;

import com.bns.api.tradeprocessor.security.SecurityId;
import com.bns.api.tradeprocessor.dto.Message;
import com.bns.api.tradeprocessor.dto.TradeMessage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;


import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class TradeProcessorTest {

    private TradeProcessor tradeProcessor;

    @Mock
    private KafkaTemplate<String, TradeMessage> kafkaTemplate;

    @Mock
    private RestTemplate restTemplate;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        tradeProcessor = new TradeProcessor(kafkaTemplate, restTemplate);
    }

    @Test
    public void testValidMessageProcessing() {
        Message validMessage = createValidMessage();

        SecurityId securityDetails = new SecurityId();
        securityDetails.setRic("RIC");

        when(restTemplate.exchange(
                anyString(),
                any(),
                any(),
                eq(SecurityId.class))
        ).thenReturn(ResponseEntity.ok(securityDetails));

        tradeProcessor.onMessage(validMessage);

        //verify(kafkaTemplate, times(1)).sendDefault(anyString(), any(TradeMessage.class));
    }

    @Test
    public void testInvalidMessageProcessing() {
        Message invalidMessage = createInvalidMessage();

        tradeProcessor.onMessage(invalidMessage);

        verify(kafkaTemplate, never()).sendDefault(anyString(), any(TradeMessage.class));
    }

    private Message createValidMessage() {
        // Create a valid FIX message as a string
        String fixMessage = "17=EXEC123|48=AAPL|22=RIC|1=ACC123|32=100|6=150.25";
        return new Message(fixMessage);
    }

    private Message createInvalidMessage() {
        // Create an invalid FIX message as a string
        String fixMessage = "17=EXEC123|32=100|6=150.25"; // Missing required fields
        return new Message(fixMessage);
    }
}