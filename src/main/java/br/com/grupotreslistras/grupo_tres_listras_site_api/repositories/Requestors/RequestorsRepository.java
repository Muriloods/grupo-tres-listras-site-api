package br.com.grupotreslistras.grupo_tres_listras_site_api.repositories.Requestors;

import br.com.grupotreslistras.grupo_tres_listras_site_api.entities.Requestor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RequestorsRepository extends MongoRepository<Requestor, String> {

}
