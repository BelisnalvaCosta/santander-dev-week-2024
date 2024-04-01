package me.dio.sdw2024.domain.ports;

import me.dio.sdw2024.domain.model.Champion;

import java.util.List;
import java.util.Optional;

public interface ChampionsRepository {
    List<Champion> findAll();

    Optional<Champion> findById(Long id);
}
