/*
 * program, which find and output smallest and biggest elements in the array, and
 * modify array with replacing smallest and biggest elements, and
 * finding the average of the array
 */
package com.homeWork;

public class InArray {

    public static void main(String[] args) {

        int[] arr = {7, 1, 3, 2, -1, 5, 2, 1, 7, 6};
        double smallest = 1.0 / 0.0;
        double biggest = -1.0 / 0.0;
        int counterSmall = 0;
        int counterBig = 0;

        // finding the smallest and biggest elements
        for (int el : arr) {
            if (el < smallest) {
                smallest = el;
            }
            if (el > biggest) {
                biggest = el;
            }
        }

        //counting the number of given elements
        for (int el : arr) {
            if (el == smallest) {
                counterSmall++;
            }
            if (el == biggest){
                counterBig++;
            }
        }

        // output the items
        System.out.println("the smallest elements: ");
        for (int i = 0; i < counterSmall; i++) {
            System.out.print((int) smallest + " ");
        }
        System.out.println();

        System.out.println("the biggest elements: ");
        for (int i = 0; i < counterBig; i++) {
            System.out.print((int) biggest + " ");
        }

        int[] newArr = arr.clone();
        // replacing elements in the array
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] == smallest) {
                newArr[i] = (int) biggest;
            } else if (arr[i] == biggest) {
                newArr[i] = (int) smallest;
            }
        }
        System.out.println();
        System.out.println("modified array:");
        for (int el : newArr) {
            System.out.print(el + " ");
        }
        System.out.println();

        // average of array elements
        double sum = 0;
        for (int el : arr){
            sum += el;
        }
        System.out.println("average of the array is: " + (sum / (double) arr.length));
    }
}
