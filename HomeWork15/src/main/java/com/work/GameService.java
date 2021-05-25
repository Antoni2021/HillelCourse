package com.work;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameService {

    Hand in;
    Hand computer;
    static Map<Integer, Integer> results = new HashMap<>();


//                  ROCK (0),  PAPER(1),   SCISSORS(2)
//    ROCK (0),     x           0           1
//    PAPER (1),     1           x           0
//    SCISSORS(2)   0           1           x
    static int[][] result = {{0, -1, 1}, {1, 0, -1}, {-1, 1, 0}};

    public static void game(String str){
        int handNum = 0;
        try {
            handNum = Integer.parseInt(str);
        } catch (NumberFormatException E){
            System.out.println("Try again");
            game(new Scanner(System.in).nextLine());
        }
        results.put(0, result[handNum][0]);

    }

}
