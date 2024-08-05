package br.com.grupotreslistras.grupo_tres_listras_site_api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "requestor")
public class Requestor {
    @Id
    String id;
    String name;
    String instagram;
}
