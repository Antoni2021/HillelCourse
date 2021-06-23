package com.work;

import java.util.Scanner;

public class GameService {

    public static int getNumber(){
        System.out.println("Please, enter the number of games:");
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine().trim();
        int num = 0;
        try {
            num = Integer.parseInt(in);
            Log.loggerDebug.info(Game.name + " choose " + in + " games");
        } catch (NumberFormatException E) {
            Log.loggerWarn.warn(Game.name + " enter not a number, when choose a number of games");
            System.out.println("There is no number, try again ");
            num = getNumber();
        }
        return num;
    }

    public static int getHand(){
        System.out.println("Please, enter '0' - rock, '1' - paper, '2' - scissors");
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine().trim();
        if (in.equals("q")){
            Log.loggerError.error("Game finished, because of player ");
            resultOfGame();
            System.exit(0);
        }
        int hand = 0;
        try {
            hand = Integer.parseInt(in);
        } catch (NumberFormatException E) {
            Log.loggerWarn.warn(Game.name + " enter not a number, when choose a hand");
            System.out.println("There is not the number, try again ");
            hand = getHand();
        }
        if (hand > 2){
            System.out.println("There is no that hand, try again");
            Log.loggerWarn.warn(Game.name + " choose unreal hand");
            hand = getHand();
        }
        return hand;
    }

    public static String chooseResults(int res){
        String str = "";
        switch (res) {
            case -1 -> {
                str = "game win the computer";
                Game.loses++;
            }
            case 1 -> {
                str = "game win " + Game.name;
                Game.wins++;
            }
            case 0 -> {
                str = "draw";
                Game.draws++;
            }
        }
        return str;
    }

    public static void resultOfGame(){
        Game.res = Game.name + " win " + Game.wins + " time(s);\n" + Game.name + " loose " + Game.loses +
                " time(s);\nIt was " + Game.draws + " draw(s).";
        System.out.println();
        System.out.println(Game.res);
        Log.loggerResults.info("\n" + Game.res);
        Log.loggerDebug.debug("\n" + Game.name + " choose " + Game.countOfRounds + " games, \n" +
                " played " + Game.count + " games, \n" +
                "not finished " + (Game.countOfRounds - Game.count) + " games");
        Log.loggerDebug.debug("Game finished");
//        OutputFile.resultToFile(Game.res);
    }

}
