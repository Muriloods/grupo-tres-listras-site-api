package br.com.grupotreslistras.grupo_tres_listras_site_api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "contactors")
public class Contactor {
    @Id
    private String id;
    private String name;
    private String email;
}
