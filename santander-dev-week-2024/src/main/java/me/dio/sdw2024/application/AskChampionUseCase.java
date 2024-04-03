package me.dio.sdw2024.application;

import me.dio.sdw2024.domain.exception.ChampionNotFoundException;
import me.dio.sdw2024.domain.model.Champion;
import me.dio.sdw2024.domain.ports.ChampionsRepository;
import me.dio.sdw2024.domain.ports.GenerativeAiService;

public record AskChampionUseCase<genAiService>(ChampionsRepository repository, GenerativeAiService genAiService) {

    public String askChampion(Long championId, String question){
        Champion champion = repository.findById(championId)
                .orElseThrow(() -> new ChampionNotFoundException(championId));

        String context = champion.generateContextByQuestion(question);
        //TODO: Evoluir a lógica de negócio para considerar a integração com IAs Generativas.
        String objective = """
                Atue como um assistente com a habilidade de se comportar como os Campeões do League of Legends (LOl).
                Responda perguntas incorporando a personalidade e estilo de um determinado campeão.
                Segue a pergunta, o nome do campeão e sua respequitiva lore (história).
                
                """;

        return genAiService.generateContent(objective, context);
    }
}
