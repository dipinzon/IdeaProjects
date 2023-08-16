package com.bns.api.tradeprocessor.controller;

import com.bns.api.tradeprocessor.dto.Message;
import com.bns.api.tradeprocessor.processor.TradeProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/process")
public class TradeProcessorController {

    private final TradeProcessor tradeProcessor;

    @Autowired
    public TradeProcessorController(TradeProcessor tradeProcessor) {
        this.tradeProcessor = tradeProcessor;
    }

    @PostMapping("/fix-message")
    public String processFixMessage(@RequestBody String fixMessage) {

        try {
            Message message = new Message(fixMessage);
            tradeProcessor.onMessage(message);
            return "Trade processing initiated successfully.";
        } catch (Exception e) {
            return "Error processing trade: " + e.getMessage();
        }
    }
}
