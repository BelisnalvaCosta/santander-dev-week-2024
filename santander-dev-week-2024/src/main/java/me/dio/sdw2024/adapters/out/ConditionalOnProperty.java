package me.dio.sdw2024.adapters.out;

public @interface ConditionalOnProperty {
    String havingValue();

    boolean matchIfMissing();

    String name();
}
