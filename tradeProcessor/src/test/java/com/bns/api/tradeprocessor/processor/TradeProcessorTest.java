package com.bns.api.tradeprocessor.processor;

import com.bns.api.tradeprocessor.config.SecurityId;
import com.bns.api.tradeprocessor.model.Message;
import com.bns.api.tradeprocessor.model.TradeMessage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.client.RestTemplate;

import static org.mockito.Mockito.*;

public class TradeProcessorTest {

    @Mock
    private KafkaTemplate<String, TradeMessage> kafkaTemplate;

    @Mock
    private RestTemplate restTemplate;

    private TradeProcessor tradeProcessor;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        tradeProcessor = new TradeProcessor(kafkaTemplate, restTemplate);
    }

    @Test
    public void testOnMessage() {
        Message mockMessage = mock(Message.class);
        when(mockMessage.getString(17)).thenReturn("123");
        when(mockMessage.getString(48)).thenReturn("AAPL");
        when(mockMessage.getString(22)).thenReturn("ISIN");
        when(mockMessage.getString(1)).thenReturn("user123");
        when(mockMessage.getInt(32)).thenReturn(100);
        when(mockMessage.getDouble(6)).thenReturn(150.0);

        SecurityId mockSecurityDetails = mock(SecurityId.class);
        when(mockSecurityDetails.getTicker()).thenReturn("AAPL");
        when(mockSecurityDetails.getIsin()).thenReturn("US123456789");
        when(mockSecurityDetails.getSedol()).thenReturn("1234567");
        when(mockSecurityDetails.getCusip()).thenReturn("123ABC");
        when(mockSecurityDetails.getRic()).thenReturn("AAPL.N");

        ResponseEntity<SecurityId> mockResponseEntity = ResponseEntity.ok(mockSecurityDetails);
        when(restTemplate.exchange(
                anyString(),
                eq(HttpMethod.POST),
                any(HttpEntity.class),
                eq(SecurityId.class)
        )).thenReturn(mockResponseEntity);

        tradeProcessor.onMessage(mockMessage);

        verify(kafkaTemplate, times(1)).sendDefault(anyString(), any(TradeMessage.class));
    }
}
