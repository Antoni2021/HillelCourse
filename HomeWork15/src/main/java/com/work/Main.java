/*Написать консольную игру камень ножницы бумага

пользователь должен выбирать количество игр и ввести свое имя
пользователь должен иметь возможность прервать игру
после прекращения игры пользователь должен увидеть результат
*/


package com.work;

<<<<<<< Updated upstream
import java.util.HashMap;
=======
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
>>>>>>> Stashed changes

public class Main {

    public static void main(String[] args) {

<<<<<<< Updated upstream
//        HashMap<String, Hand> init = new HashMap<String, Hand>();
        
=======
        Scanner sc = new Scanner(System.in);
        System.out.println("Let`s start the game. If you want exit the game, enter 'q'");
        System.out.println("Please, enter the number of games:");
        String in = sc.nextLine();
        if (in.equals("y")){
            System.exit(-1);
        }
        String name = sc.next();

        int num;
        try {
            num = Integer.parseInt(in);
        } catch (NumberFormatException E) {
            System.out.println("There is no number, try again ");
        }

        GameService.game(in);
        System.out.println(GameService.results);
        var random = new Random();
        var list = Arrays.asList(Hand.ROCK, Hand.PAPER, Hand.SCISSORS);
        var randomElement = list.get(random.nextInt(list.size()));
        System.out.println(randomElement);
>>>>>>> Stashed changes
    }
}
