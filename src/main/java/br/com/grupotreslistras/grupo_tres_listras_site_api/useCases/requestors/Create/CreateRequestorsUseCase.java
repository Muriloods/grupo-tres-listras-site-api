package br.com.grupotreslistras.grupo_tres_listras_site_api.useCases.requestors.Create;

import br.com.grupotreslistras.grupo_tres_listras_site_api.entities.Requestor;
import br.com.grupotreslistras.grupo_tres_listras_site_api.providers.kafka.producer.KafkaProducer;
import br.com.grupotreslistras.grupo_tres_listras_site_api.repositories.Requestors.RequestorsRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateRequestorsUseCase {
    @Autowired
    RequestorsRepository repository;
    @Autowired
    private KafkaProducer kafkaProducer;

    public Requestor execute(Requestor requestor) {
        Requestor req = repository.insert(requestor);
        kafkaProducer.send("CREATE_FAN", new Gson().toJson(req));
        return req;
    }
}
