package com.work;

import java.util.Scanner;

public class GameService {

    public static int getNumber(){
        Log.loggerInfo.info("Please, enter the number of games:");
//        System.out.println("Please, enter the number of games:");
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine().trim();
        int num = 0;
        try {
            num = Integer.parseInt(in);
        } catch (NumberFormatException E) {
            Log.loggerWarn.warn("There is no number, try again ");
//            System.out.println("There is no number, try again ");
            num = getNumber();
        }
        return num;
    }

    public static int getHand(){
        Log.loggerInfo.info("Please, enter '0' - rock, '1' - paper, '2' - scissors");
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine().trim();
        if (in.equals("q")){
            resultOfGame();
            System.exit(0);
        }
        int hand = 0;
        try {
            hand = Integer.parseInt(in);
        } catch (NumberFormatException E) {
            Log.loggerWarn.warn("There is not the number, try again ");
//            System.out.println("There is not the number, try again ");
            hand = getHand();
        }
        if (hand > 2){
            Log.loggerWarn.warn("There is not the number, try again ");
            System.out.println("There is no that hand, try again");
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
        Log.loggerInfo.info(Game.res);
//        System.out.println(Game.res);
        OutputFile.resultToFile(Game.res);
    }

}
