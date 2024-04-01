package me.dio.sdw2024;

import me.dio.sdw2024.domain.model.Champion;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SantanderDevWeek2024ApplicationTests {
	@Autowired
	private ListChampionsUseCase listChampionsUseCase;

	public void testListChampions() {
		List<Champion> champions = listChampionsUseCase.findAll();
		Assertions.assertEquals(12, champions.size());
	}
}
