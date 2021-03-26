/*
 * programs which output odd numbers with three kind of loops
 */
package com.homeWork;

public class OddNumbers {

    public static void main(String[] args) {

        //output odd numbers from 0 to 100 with for loop
        for (int i = 1; i < 100; i +=2){
            System.out.print(i + " ");
        }
        System.out.println();

        //output odd numbers with while loop
        int n = 1;
        while (n < 100){
            System.out.print(n + " ");
            n += 2;
        }
        System.out.println();

        //output odd numbers with do-while loop
        n = 1;
        do {
            System.out.print(n + " ");
            n += 2;
        } while (n < 100);
    }
}
