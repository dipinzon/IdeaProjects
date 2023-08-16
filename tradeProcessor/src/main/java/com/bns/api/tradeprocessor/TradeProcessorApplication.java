package com.bns.api.tradeprocessor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class TradeProcessorApplication {

    public static void main(String[] args) {
        SpringApplication.run(TradeProcessorApplication.class, args);
    }

}
