package com.work;

import java.text.SimpleDateFormat;
import java.util.*;

//                  ROCK (0),  PAPER(1),   SCISSORS(2)
//    ROCK (0),      0          -1           1
//    PAPER (1),     1           0          -1
//    SCISSORS(2)   -1           1           0

public class Game {

    static Map<Integer, String> results = new HashMap<>();
    static String name;
    static int count = 0;
    static int countOfRounds = 0;
    static int wins = 0;
    static int loses = 0;
    static int draws = 0;
    static int[][] result = {{0, -1, 1}, {1, 0, -1}, {-1, 1, 0}};
    static String res;

    public static void start() {

        Scanner sc = new Scanner(System.in);
        Log.loggerDebug.debug("Game started");
        System.out.println("Let`s start the game!");
        System.out.println("Please, enter your name:");
        name = sc.next();
        int countOfGames = GameService.getNumber();
        countOfRounds = countOfGames;
        System.out.println("If you want exit the game, you always can enter 'q'");
        while (countOfGames-- != 0) {
            int randomElement = Arrays.asList(0, 1, 2).get(new Random().nextInt(3));
            int handNum = GameService.getHand();
            String oneGameResult = name + " choose " + Hand.hand.get(handNum) + ", computer choose " +
                    Hand.hand.get(randomElement) + ": " + GameService.chooseResults(result[handNum][randomElement]);
            System.out.println(oneGameResult);
            Log.loggerInfo.info(oneGameResult);
            results.put(count++, oneGameResult);
//            OutputFile.logToFile(oneGameResult);
        }
        GameService.resultOfGame();

    }
}
