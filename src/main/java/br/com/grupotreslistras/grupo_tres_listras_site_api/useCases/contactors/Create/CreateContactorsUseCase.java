package br.com.grupotreslistras.grupo_tres_listras_site_api.useCases.contactors.Create;

import br.com.grupotreslistras.grupo_tres_listras_site_api.entities.Contactor;
import br.com.grupotreslistras.grupo_tres_listras_site_api.providers.kafka.producer.KafkaProducer;
import br.com.grupotreslistras.grupo_tres_listras_site_api.repositories.Contactors.ContactorsRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateContactorsUseCase {
    @Autowired
    ContactorsRepository contactorsRepository;
    @Autowired
    private KafkaProducer kafkaProducer;

    public Contactor execute(Contactor contactor) {
        Contactor cont = contactorsRepository.insert(contactor);
        kafkaProducer.send("CREATE_FAN", new Gson().toJson(cont));
        return cont;
    }

}
