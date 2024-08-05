package br.com.grupotreslistras.grupo_tres_listras_site_api.useCases.requestors.Create;

import br.com.grupotreslistras.grupo_tres_listras_site_api.entities.Requestor;
import br.com.grupotreslistras.grupo_tres_listras_site_api.repositories.Requestors.RequestorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateRequestorsUseCase {
    @Autowired
    RequestorsRepository repository;

    public Requestor execute(Requestor requestor) {
        return repository.insert(requestor);
    }
}
