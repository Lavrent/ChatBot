package com.aca.chatbot;

import com.aca.chatbot.calculator.Calculator;
import com.aca.chatbot.games.GameType;
import com.aca.chatbot.games.guessNumber.GuessNumber;
import com.aca.chatbot.games.ticTacToe.TicTacToe;

import java.util.Scanner;

public class ChatOptions {

    public static void calculate() {
        Calculator.finalCalculation();
    }

    public static void play() {
        System.out.println("which game do you want to play?");
        Scanner input = new Scanner(System.in);
        String gameType = input.nextLine();

        try {

            switch (GameType.valueOf(gameType.toUpperCase())) {
                case TIC_TAC_TOE:
                    TicTacToe.play();
                    break;
                case GUESS_THE_NUMBER:
                    GuessNumber.guess();
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("there is no such game");
        }
    }
}
