package com.cheese.api;

import com.typesafe.config.Config;

public class ApiConfig {

    public static ApiConfig create(Config config) {
        return new ApiConfig(
                config.getInt("api.port")
        );
    }

    private final int port;


    private ApiConfig(int port) {
        this.port = port;
    }

    public int getPort() {
        return port;
    }
}
