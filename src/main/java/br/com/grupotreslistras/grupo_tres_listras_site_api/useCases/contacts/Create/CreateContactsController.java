package br.com.grupotreslistras.grupo_tres_listras_site_api.useCases.contacts.Create;

import br.com.grupotreslistras.grupo_tres_listras_site_api.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contact")
public class CreateContactsController {
    @Autowired
    public CreateContactUseCase createContactUseCase;

    @PostMapping
    public ResponseEntity create(@RequestBody Contact contact) {
        Contact ctt = createContactUseCase.execute(contact);
        return ResponseEntity.ok().body(ctt);
    }
}
