package br.com.grupotreslistras.grupo_tres_listras_site_api.useCases.musicRequests.Create;

import br.com.grupotreslistras.grupo_tres_listras_site_api.entities.MusicRequest;
import br.com.grupotreslistras.grupo_tres_listras_site_api.entities.Requestor;
import br.com.grupotreslistras.grupo_tres_listras_site_api.repositories.MusicRequests.MusicRequestsRepository;
import br.com.grupotreslistras.grupo_tres_listras_site_api.useCases.requestors.Create.CreateRequestorsUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateMusicRequestsUseCase {
    @Autowired
    CreateRequestorsUseCase createRequestorsUseCase;
    @Autowired
    MusicRequestsRepository repository;

    public MusicRequest execute(String eventId, MusicRequest musicRequest) {
        Requestor req = createRequestorsUseCase.execute(musicRequest.getRequestor());
        musicRequest.setRequestor(req);
        return repository.insert(musicRequest);
    }
}
