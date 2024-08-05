package br.com.grupotreslistras.grupo_tres_listras_site_api.useCases.musicRequests.Create;

import br.com.grupotreslistras.grupo_tres_listras_site_api.entities.MusicRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("event/{eventId}/music-request")
public class CreateMusicRequestsController {
    @Autowired
    CreateMusicRequestsUseCase createMusicRequestsUseCase;
    @PostMapping
    public ResponseEntity create(@PathVariable String eventId, @RequestBody MusicRequest musicRequest) {
        musicRequest.setEventId(eventId);
        MusicRequest mscR = createMusicRequestsUseCase.execute(eventId, musicRequest);
        return ResponseEntity.ok().body(mscR);
    }
}
