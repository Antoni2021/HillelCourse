/*
 * program which calculate the number in some degree
 */
package com.homeWork;

public class Degree {

    public static void main(String[] args) {

        // calculating the x number in n degree
        int x = 1;
        int n = 1;
        double sum = 1;

        if (x == 0){
            sum = 0;
        } else if (n == 0){
            sum = 1;
        } else if (n < 0) {
            n /= -1;
            double divider = 1;
            for (int i = 1; i <= n; i++){
                divider *= x;
            }
            sum = 1 / divider;
        } else {
            for (int i = 1; i <= n; i++){
                sum *= x;
            }
        }

        if ( sum >= 1) {
            System.out.println((int)sum);
        } else {
            System.out.println(sum);
        }
    }

}
