package org.example.ollamademo;

public class ChatEntry {
    private String question;
    private String response;

    public ChatEntry(String question, String response) {
        this.question = question;
        this.response = response;
    }

    public String getQuestion() {
        return question;
    }

    public String getResponse() {
        return response;
    }
}

