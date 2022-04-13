package com.amol.kafkaconsumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ProductEventsConsumer {

    @KafkaListener(topics = {"default-product-events"})
    public void onMessage(ConsumerRecord<Integer, String> consumerRecord){
        log.info("** Consumer Record ** : {}", consumerRecord);
    }
}
