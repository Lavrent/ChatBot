package com.aca.chatbot.games.guessNumber;

import java.util.Scanner;

public class GuessNumber {
    public static void guess() {
        System.out.println("input the number");
        Game gm = new Game();
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int steps = 1;
        while (gm.guess(num) != Operands.EQUAL) {
            steps++;
            System.out.println(gm.guess(num));
            System.out.println("input the number");
            num = in.nextInt();
        }
        System.out.println("That's right");
        System.out.println("number of steps are -> " + steps);
    }

}
