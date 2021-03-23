/*
 * The program, which find average of any amount of numbers
 */
package com.homeWork;

public class AllAverage {
    public static void main(String[] args) {

        double sum = 0d;
        for (String str : args) {
            int number = Integer.parseInt(str);
            sum += number;
        }
        double average = sum / args.length;
        System.out.println("Average of all input numbers is " + average);
    }
}
