package br.com.grupotreslistras.grupo_tres_listras_site_api.providers.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
//    @KafkaListener(topics = "teste", groupId = "teste")
//    public void consume(String topic, String message) {
//        System.out.println(message);
//    }
}
