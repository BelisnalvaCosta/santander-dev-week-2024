package me.dio.sdw2024.adapters.out.in.exception;

import me.dio.sdw2024.domain.model.Champion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Campeões", description = "Endpoints do domínio de Campeões do LOL.")
@RestController
@RequestMapping("/champions")
public record ListChampionsRestController(ListChampionsUseCase useCase) {
    @GetMapping
    public List<Champion> findAllChampions() {
        return useCase.findAll();
    }

}
