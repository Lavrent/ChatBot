package com.aca.chatbot;
import com.aca.filedb.Repository;
import com.aca.filedb.StringValueRepository;

import java.io.IOException;
import java.util.Scanner;

public class ChatBot {
    public static void chat() {
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();
        while (!isFinished(userInput)) {
            String chatBotAnswer;

            try (Repository<String, String> repository = new StringValueRepository<>("chat.txt")) {
                repository.open();
                try {
                    chatBotAnswer = repository.get(userInput.toLowerCase());
                    playOrCalculate(chatBotAnswer);
                    System.out.println(chatBotAnswer);
                } catch (NullPointerException e) {
                    System.out.println("I don't know what to respond, Can you hint me?");
                    chatBotAnswer = in.nextLine();
                    repository.put(userInput.toLowerCase(), chatBotAnswer);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void playOrCalculate(String input) {
        switch (input.toLowerCase()) {
            case "play":
                ChatOptions.play();
                break;
            case "calculate":
                ChatOptions.calculate();
                break;
        }
    }

    private static boolean isFinished(String input) {
        return input.toLowerCase().equals("finish");
    }
}
