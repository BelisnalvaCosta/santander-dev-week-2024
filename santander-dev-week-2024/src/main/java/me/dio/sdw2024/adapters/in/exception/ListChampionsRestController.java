package me.dio.sdw2024.adapters.in.exception;

import me.dio.sdw2024.application.ListChampionsUseCase;
import me.dio.sdw2024.domain.model.Champion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/champions")
public record ListChampionsRestController(ListChampionsUseCase useCase) {
    @CrossOrigin
    @GetMapping
    public List<Champion> findAllChampions() {
        return useCase.findAll();
    }
}