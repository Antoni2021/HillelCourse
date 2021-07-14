package com.work;

import java.util.*;

public class GameService {
    private static final Locale loc = new Locale("en");
    private static final ResourceBundle resource = ResourceBundle.getBundle("infoMessages", loc);
    private static final ResourceBundle logHand = ResourceBundle.getBundle("Hand", loc);
    private static final ResourceBundle hand = ResourceBundle.getBundle("Hand");

    public static int getNumber(){
        Log.loggerTrace.info(Game.info.getString("gamesNumber"));
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine().trim();
        int num = 0;
        try {
            num = Integer.parseInt(in);
            Log.loggerDebug.info(Game.name + " choose " + in + " games");
        } catch (NumberFormatException E) {
            Log.loggerWarn.warn(Game.name + " enter not a number, when choose a number of games");
            Log.loggerTrace.info(Game.info.getString("noNumber"));
            num = getNumber();
        }
        return num;
    }

    public static int getHand(){
        Log.loggerTrace.info(Game.info.getString("enterHand"));
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
            Log.loggerTrace.info(Game.info.getString("noNumber"));
            hand = getHand();
        }
        if (hand > 2){
            Log.loggerTrace.info(Game.info.getString("wrongHand"));
            Log.loggerWarn.warn(Game.name + " choose unreal hand");
            hand = getHand();
        }
        return hand;
    }

    public static String chooseResults(int res){
        String str = "";
        switch (res) {
            case -1 -> {
                str = Game.info.getString("res0");
                Game.loses++;
            }
            case 1 -> {
                str = Game.info.getString("res1") + " " + Game.name;
                Game.wins++;
            }
            case 0 -> {
                str = Game.info.getString("res2");
                Game.draws++;
            }
        }
        return str;
    }

    public static String logResults(int res) {
        String str = "";
        switch (res) {
            case -1 -> str = resource.getString("res0");
            case 1 -> str = resource.getString("res1") + " " + Game.name;
            case 0 -> str = resource.getString("res2");
        }
        return str;
    }

    public static void resultOfGame(){
        Game.res = String.format("%s win %d times; \n%s loose %d times; \nIt was %d draw(s)", Game.name, Game.wins,
                Game.name, Game.loses, Game.draws);
        String s = String.format(Game.info.getString("resultsOfGames"), Game.name, Game.wins,
                Game.name, Game.loses, Game.draws);
        Log.loggerTrace.info("\n" + s);
        Log.loggerResults.info("\n" + Game.res);
        Log.loggerDebug.debug("\n" + Game.name + " choose " + Game.countOfRounds + " games,\n" +
                " played " + Game.count + " games, \n" +
                "not finished " + (Game.countOfRounds - Game.count) + " games");
        Log.loggerDebug.debug("Game finished");
    }

    public static void resultChoosing() {
        int randomElement = Arrays.asList(0, 1, 2).get(new Random().nextInt(3));
        int handNum = getHand();
        Hand player = Hand.values()[handNum];
        Hand computer = Hand.values()[randomElement];
        int result = Game.result[handNum][randomElement];
        String res = chooseResults(result);
        String logResult = String.format("%s choose %s, computer chose %s: %s", Game.name,
                logHand.getString(player.getTitle()),
                logHand.getString(computer.getTitle()), logResults(result));
        System.out.println(hand.getString(player.getTitle()));
        String oneGameResults = String.format(Game.info.getString("chooses"), Game.name,
                hand.getString(player.getTitle()),
                hand.getString(computer.getTitle()), res);
        Log.loggerTrace.info(oneGameResults);
        Log.loggerInfo.info(logResult);
        Game.results.put(Game.count++, logResult);
    }
}
