package br.com.grupotreslistras.grupo_tres_listras_site_api.useCases.contacts.Create;

import br.com.grupotreslistras.grupo_tres_listras_site_api.entities.Contact;
import br.com.grupotreslistras.grupo_tres_listras_site_api.entities.Contactor;
import br.com.grupotreslistras.grupo_tres_listras_site_api.providers.kafka.producer.KafkaProducer;
import br.com.grupotreslistras.grupo_tres_listras_site_api.repositories.Contacts.ContactsRepository;
import br.com.grupotreslistras.grupo_tres_listras_site_api.useCases.contactors.Create.CreateContactorsUseCase;
import br.com.grupotreslistras.grupo_tres_listras_site_api.useCases.contactors.FindByEmail.FindContactorByEmailUseCase;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class CreateContactUseCase {
    @Autowired
    public ContactsRepository repository;
    @Autowired
    public FindContactorByEmailUseCase findContactorByEmailUseCase;
    @Autowired
    public CreateContactorsUseCase createContactorsUseCase;
    @Autowired
    private KafkaProducer kafkaProducer;

    public Contact execute(Contact contact) {
        Optional<Contactor> contactorExisting = findContactorByEmailUseCase.execute(contact.getContactor().getEmail());
        if (contactorExisting.isEmpty()) {
            Contactor created = createContactorsUseCase.execute(contact.getContactor());
            contact.setContactor(created);

            return repository.insert(contact);
        }
        contact.setContactor(contactorExisting.get());
        return repository.insert(contact);
    }
}
