package org.example.ollamademo;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OllamaChatService {

    @Value("${spring.ai.ollama.model}")
    private String model;

    private final ChatClient chatClient;

    public OllamaChatService(ChatClient.Builder chatClientBuilder) {
        OllamaOptions options = OllamaOptions.create();
        options.setModel(model);
        this.chatClient = chatClientBuilder
                .defaultOptions(options)
                .build();
    }

    public String getResponse(String question) {
        return chatClient.prompt()
                .user(question)
                .call()
                .content();
    }
}

