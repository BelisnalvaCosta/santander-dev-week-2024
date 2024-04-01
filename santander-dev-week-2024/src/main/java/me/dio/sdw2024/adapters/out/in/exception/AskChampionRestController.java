package me.dio.sdw2024.adapters.out.in.exception;

import org.springframework.web.bind.annotation.*;

@Tag(name = "Campeões", description = "Endpoints do domínio de Campeões do LOL.")
@RestController
@RequestMapping( "/champions")
public record AskChampionRestController(AskChampionUseCase useCase) {

    @PostMapping("/{championId}/ask")
    public AskChampionResponse askChampion(@PathVariable Long championId, @RequestBody askChampionRequest request) {
        String answer = useCase.askChapion(ChampionId, request.question());
        return new AskChampionResponse(answer);
    }

    public record AskChampionRequest(String question){}
    public record AskChampionResponse(String answer){}

}
