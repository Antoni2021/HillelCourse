/*
 * The program, which find average of two numbers
 */
package com.homeWork;

public class TwoAverage {

    public static void main(String[] args) {

        double sumOfTwo;
        sumOfTwo = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
        double averageOfTwo = sumOfTwo / 2d;
        System.out.println("Average of first two input numbers is " + averageOfTwo);
    }
}
