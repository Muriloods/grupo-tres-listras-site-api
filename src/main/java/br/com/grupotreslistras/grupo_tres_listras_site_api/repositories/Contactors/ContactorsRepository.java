package br.com.grupotreslistras.grupo_tres_listras_site_api.repositories.Contactors;

import br.com.grupotreslistras.grupo_tres_listras_site_api.entities.Contactor;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ContactorsRepository extends MongoRepository<Contactor, String> {
    Optional<Contactor> findByEmail(String email);
}
