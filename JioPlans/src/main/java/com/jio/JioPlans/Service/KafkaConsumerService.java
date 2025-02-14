package com.jio.JioPlans.Service;

import com.jio.JioPlans.Entity.KafkaMessage;
import com.jio.JioPlans.Repository.KafkaMessageRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    private final KafkaMessageRepository repository;

    public KafkaConsumerService(KafkaMessageRepository repository) {
        this.repository = repository;
    }

    @KafkaListener(topics = "plans-topic", groupId = "my-group")
    public void listen(String message) {
        System.out.println("Consumed Message: " + message);

        KafkaMessage kafkaMessage = new KafkaMessage(message);
        repository.save(kafkaMessage);

        System.out.println("Message saved in Database: "+message);
    }
}
