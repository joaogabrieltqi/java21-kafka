package com.pagseguro.java21_kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;
import ps.customer.event.avro.CustomerEvent;

import java.util.List;

@Component
public class UpdateCustomerConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpdateCustomerConsumer.class);

    @KafkaListener(
            topics = "${kafka.customer.updated.topic}",
            id = "${spring.kafka.consumer.customer-updated.id}",
            groupId = "${spring.kafka.consumer.group-id}",
            containerFactory = "kafkaListenerContainerFactory"
    )
    public void consume(List<CustomerEvent> events, Acknowledgment ack) {
        LOGGER.info("m=consume, msg=got_events, eventsSize={}", events.size());
        ack.acknowledge();
    }
}
