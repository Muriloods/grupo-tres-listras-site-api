package br.com.grupotreslistras.grupo_tres_listras_site_api.useCases.contactors.FindByEmail;

import br.com.grupotreslistras.grupo_tres_listras_site_api.entities.Contactor;
import br.com.grupotreslistras.grupo_tres_listras_site_api.repositories.Contactors.ContactorsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FindContactorByEmailUseCase {
    @Autowired
    ContactorsRepository repository;

    public Optional<Contactor> execute(String email) {
        return repository.findByEmail(email);
    }
}
