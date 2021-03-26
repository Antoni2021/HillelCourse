/*
 * program which find a factorial of number x with three kind of loop.
 */
package com.homeWork;

public class Factorial {

    public static void main(String[] args) {

        // finding and output factorial with "for" loop
        int x = 5;
        long factorial = 1;
        for (int i = 1; i <= x; i++){
            factorial *= i;
        }
        System.out.println(factorial);

        // finding and output factorial with "while" loop
        factorial = 1;
        while (x > 0){
            factorial *= x;
            x--;
        }
        System.out.println(factorial);

        // finding and output factorial with "do-while" loop
        x = 5;
        factorial = 1;
        do {
            if (x == 0){
                break;
            }
            factorial *= x;
            x--;
        } while (x > 0);
        System.out.println(factorial);
    }
}
