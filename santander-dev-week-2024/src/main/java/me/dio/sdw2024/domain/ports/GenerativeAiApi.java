package me.dio.sdw2024.domain.ports;

public interface GenerativeAiApi {

    String generativeContent(String objective, String context);
}
