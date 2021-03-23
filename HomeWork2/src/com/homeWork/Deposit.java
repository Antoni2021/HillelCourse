/*
 * The program, which count the deposit sum with compound interest
 */
package com.homeWork;

import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {

        int sumOfDeposit;
        double percent;
        int years;

        // Obtaining information from the user
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter sum of your deposit in UAH");
        sumOfDeposit = in.nextInt();
        System.out.println("Please, enter annual percentage");
        percent = in.nextDouble() / 100 / 12d;
        System.out.println("Please, enter amount of years of your deposit");
        years = in.nextInt();

        // math logic of the program
        for (int year = 1; year <= years; year++) {
            double sumOfIYear = sumOfDeposit * Math.pow(1 + percent, 12d * (double) year);
            double monthPercentYear = sumOfIYear - sumOfDeposit * Math.pow(1 + percent, 12d * (year-1));

            // displaying results to the user
            System.out.println(year + " year: ");
            System.out.println("Sum of your deposit after this year is: " + (int) sumOfIYear + "₴");
            System.out.println("Your percent in this year is " + (int) monthPercentYear + "₴");
            System.out.println();
        }
    }
}
