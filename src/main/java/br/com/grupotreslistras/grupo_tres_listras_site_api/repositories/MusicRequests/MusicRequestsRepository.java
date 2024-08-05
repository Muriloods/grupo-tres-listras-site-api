package br.com.grupotreslistras.grupo_tres_listras_site_api.repositories.MusicRequests;

import br.com.grupotreslistras.grupo_tres_listras_site_api.entities.MusicRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MusicRequestsRepository extends MongoRepository<MusicRequest, String> {

}
