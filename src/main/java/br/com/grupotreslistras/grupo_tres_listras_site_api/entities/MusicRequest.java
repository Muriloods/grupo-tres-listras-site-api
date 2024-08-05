package br.com.grupotreslistras.grupo_tres_listras_site_api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "music_requests")
public class MusicRequest {
    @Id
    private String id;
    @DBRef
    private Requestor requestor;
    private String eventId;
    private String music_name;
    private String dedication;
}
