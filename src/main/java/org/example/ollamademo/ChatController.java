package org.example.ollamademo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ChatController {

    private final List<ChatEntry> chatHistory = new ArrayList<>();
    private final OllamaChatService ollamaChatService;

    public ChatController(OllamaChatService ollamaChatService) {
        this.ollamaChatService = ollamaChatService;
    }

    @GetMapping("/chat")
    public String showChatPage(Model model) {
        model.addAttribute("chatHistory", chatHistory);
        return "chat";
    }

    @PostMapping("/chat")
    public String handleChatInput(@RequestParam("question") String question, Model model) {
        String response = ollamaChatService.getResponse(question);
        chatHistory.add(new ChatEntry(question, response));
        model.addAttribute("chatHistory", chatHistory);
        return "chat";
    }
}

