package me.dio.sdw2024.domain.ports;

public interface GenerativeAiService {

    String generativeContent(String objective, String context);

    String generateContent(String objective, String context);
}
