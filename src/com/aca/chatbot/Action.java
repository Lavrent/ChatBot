package com.aca.chatbot;

import java.util.Scanner;

public class Action {
    public static void start() {
        while (true) {
            System.out.println("choose the action");
            Scanner input = new Scanner(System.in);
            String chatType = input.nextLine();
            switch (ChatTypes.valueOf(chatType.toUpperCase())) {
                case PLAY:
                    ChatOptions.play();
                    break;
                case CALCULATE:
                    ChatOptions.calculate();
                    break;
                case FINISH:
                    break;
                default:
                    //TODO CHAT
            }
            if (chatType.toUpperCase().equals("FINISH"))
                break;
        }
    }
}
