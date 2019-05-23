package com.aca.chatbot.games.guessNumber;

import java.util.Random;

public class Game {
    private int num;

    public Game() {
        Random rand = new Random();
        num = rand.nextInt(2000);
    }

    Operands guess(int guess_num) {
        Operands op;
        if (num < guess_num)
            op = Operands.LESS;
        else if (num == guess_num)
            op = Operands.EQUAL;
        else
            op = Operands.MORE;

        return op;
    }


}
