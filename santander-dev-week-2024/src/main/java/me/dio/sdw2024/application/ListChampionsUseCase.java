package me.dio.sdw2024.application;

import me.dio.sdw2024.domain.model.Champion;
import me.dio.sdw2024.domain.ports.ChampionsRepository;

import java.util.List;

public record ListChampionsUseCase(ChampionsRepository repository) {
    public List<Champion> findAll(){
        return repository.findAll();
    }
}
