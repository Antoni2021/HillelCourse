/*
 * program, which output first ten numbers from progression 0, -5,-10,-15..
 */
package com.homeWork;

public class Progression {

    public static void main(String[] args) {

        int num = 0;
        int i = 0;
        do {
            System.out.print(num + " ");
            num -= 5;
            i++;
        } while (i < 10);
        System.out.println();
    }
}
