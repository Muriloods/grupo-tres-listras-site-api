package br.com.grupotreslistras.grupo_tres_listras_site_api.repositories.Contacts;

import br.com.grupotreslistras.grupo_tres_listras_site_api.entities.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactsRepository extends MongoRepository<Contact, String> {

}
