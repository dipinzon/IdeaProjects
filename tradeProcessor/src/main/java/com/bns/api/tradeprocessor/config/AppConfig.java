package com.bns.api.tradeprocessor.config;

import com.bns.api.tradeprocessor.model.TradeMessage;
import com.fasterxml.jackson.databind.JsonSerializer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class AppConfig {
    @Bean
    public KafkaTemplate<String, TradeMessage> KafkaTemplate()
    {
        return new KafkaTemplate<>(producerFactory());
    }

    /** In the producerFactory() method, customize the Kafka producer configuration as needed,
    including specifying the bootstrap servers, serializers for the key and value,
    and any other producer-specific settings.*/

    @Bean
    public DefaultKafkaProducerFactory<String, TradeMessage> producerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "your-bootstrap-servers"); //Replace "your-bootstrap-servers" with the actual addresses of your Kafka brokers.
        configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, org.apache.kafka.common.serialization.StringSerializer.class);
        configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return new DefaultKafkaProducerFactory<>(configProps);
    }

    @Bean
    // Configure and create RestTemplate bean to incorporate the additional security information into the TradeMessage
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
