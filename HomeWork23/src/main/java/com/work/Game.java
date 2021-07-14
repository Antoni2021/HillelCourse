package com.work;

import java.util.*;
/*
                  ROCK (0),  PAPER(1),   SCISSORS(2)
    ROCK (0),      0          -1           1
    PAPER (1),     1           0          -1
    SCISSORS(2)   -1           1           0
*/
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

    static ResourceBundle info = ResourceBundle.getBundle("infoMessages");

    public static void start() {

        Log.loggerTrace.info("Hi! If you want choose some language, please enter as argument of app: us, ua or ru");
        Scanner sc = new Scanner(System.in);
        Log.loggerDebug.debug("Game started");
        Log.loggerTrace.info(info.getString("gameStart"));
        Log.loggerTrace.info(info.getString("name"));
        name = sc.next();
        int countOfGames = GameService.getNumber();
        countOfRounds = countOfGames;
        Log.loggerTrace.info(info.getString("exit"));
        while (countOfGames-- != 0) {
            GameService.resultChoosing();
        }
        GameService.resultOfGame();
    }
}
