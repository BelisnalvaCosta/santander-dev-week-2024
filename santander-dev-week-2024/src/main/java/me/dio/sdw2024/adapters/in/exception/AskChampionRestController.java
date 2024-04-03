package me.dio.sdw2024.adapters.in.exception;

import me.dio.sdw2024.application.AskChampionUseCase;
import org.junit.jupiter.api.Tag;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Campeões",  description = "Endpoints do domínio de Campeões do LOL.")
@RestController
@RequestMapping("/champions")
public record AskChampionRestController(AskChampionUseCase useCase) {

    @CrossOrigin
    @PostMapping("/{championId}/ask")
    public AskChampionResponse askChampion(@PathVariable Long championId, @RequestBody AskChampionRequest request) {
        String answer = useCase.askChampion(championId, request.question());
        return new AskChampionResponse(answer);
    }

    public record AskChampionRequest(String question) { }
    public record AskChampionResponse(String answer) { }
}