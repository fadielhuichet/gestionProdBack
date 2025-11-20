// src/main/java/com/fedicode/gestionprodback/config/DotEnvConfig.java
package com.fedicode.gestionprodback.config;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DotEnvConfig {

    static {
        Dotenv dotenv = Dotenv.configure()
                .directory("./")           // project root
                .ignoreIfMissing()         // do not fail if .env is missing (useful in production)
                .load();

        dotenv.entries().forEach(entry ->
                System.setProperty(entry.getKey(), entry.getValue())
        );
    }
}