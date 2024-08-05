package br.com.grupotreslistras.grupo_tres_listras_site_api.useCases.contactors.Create;

import br.com.grupotreslistras.grupo_tres_listras_site_api.entities.Contactor;
import br.com.grupotreslistras.grupo_tres_listras_site_api.repositories.Contactors.ContactorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateContactorsUseCase {
    @Autowired
    ContactorsRepository contactorsRepository;

    public Contactor execute(Contactor contactor) {
        return contactorsRepository.insert(contactor);
    }

}
