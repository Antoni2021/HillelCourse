/*
 *
ДЗ со звездочкой:
Программа "Угадай число"
Компьютер «загадывает» целое число от 1 до 200.
Пользователь должен угадать число.
Когда пользователь вводит свою догадку, компьютер отвечает,
было ли это число больше или меньше загаданного. Игра продлжается
до угадывания числа. Результат игры вывод на экран количества попыток
 */

package com.homeWork.tasks;

import java.util.Scanner;

public class FindNumber {

    public static void main(String[] args) {

        int number = (int) (Math.random() * 200);
        System.out.println(number);

        Scanner sc = new Scanner(System.in);
        int chance;
        int counter = 0;
        do {
            System.out.println("Please enter your number, from 1 to 200: ");
            chance = sc.nextInt();
            counter++;
            if (chance > number){
                System.out.println("required number is less than your");
            } else if (chance < number){
                System.out.println("required number is bigger than your");
            }
        } while (chance != number);
        System.out.println("You right! The number is \"" + number + "\"");
        System.out.println("You find it on " + counter + " try");

    }
}
