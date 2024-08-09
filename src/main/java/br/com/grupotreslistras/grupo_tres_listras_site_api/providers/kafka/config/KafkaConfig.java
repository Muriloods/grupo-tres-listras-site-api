package br.com.grupotreslistras.grupo_tres_listras_site_api.providers.kafka.config;

import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.*;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaConfig {
    @Value("${bootstrap.servers}")
    public String bootstrapServers;

    @Value("${sasl.mechanism}")
    public String sslMechanism;

    @Value("${security.protocol}")
    public String securityProtocol;

    @Value("${sasl.jaas.config}")
    public String saslJaasConfig;

    @Bean
    public KafkaTemplate<String,String> kafkaTemplate() {
        return new KafkaTemplate<>(producer());
    }

    private ProducerFactory<String, String> producer() {
        Map<String, Object> props = new HashMap<>();

        props.put("bootstrap.servers", bootstrapServers);
        props.put("sasl.mechanism", sslMechanism);
        props.put("security.protocol", securityProtocol);
        props.put("sasl.jaas.config", saslJaasConfig);
        props.put("key.serializer", StringSerializer.class);
        props.put("value.serializer", StringSerializer.class);

        return new DefaultKafkaProducerFactory<>(props);
    }
}
