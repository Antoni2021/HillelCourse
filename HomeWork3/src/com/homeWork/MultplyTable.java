/*
 * program, which output multiplication table of any input number
 */
package com.homeWork;

import java.util.Scanner;

public class MultplyTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter number");
        int number = sc.nextInt();

        System.out.println("Multiplication table for " + number);
        for (int i = 0; i < 10; i++){
            System.out.println(i + " * " + number + " = " + (number * i));
        }
    }
}
