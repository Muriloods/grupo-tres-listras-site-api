package br.com.grupotreslistras.grupo_tres_listras_site_api;

import br.com.grupotreslistras.grupo_tres_listras_site_api.providers.kafka.producer.KafkaProducer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class GrupoTresListrasSiteApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(GrupoTresListrasSiteApiApplication.class, args);
	}
}
