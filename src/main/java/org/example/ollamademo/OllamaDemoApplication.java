package org.example.ollamademo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OllamaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OllamaDemoApplication.class, args);
    }
}
