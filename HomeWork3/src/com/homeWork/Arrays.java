/*
 * Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну строку, разделяя запятой.
 */
package com.homeWork;

public class Arrays {

    public static void main(String[] args) {

        int[] oddNumbers = new int[10];
        int number = 1;
        for (int i = 0; i < oddNumbers.length; i++){
            oddNumbers[i] = number;
            number +=2;
        }

        for (int i = 0; i < oddNumbers.length; i++){
            if (i == 9){
                System.out.print(oddNumbers[i]);
                break;
            }
            System.out.print(oddNumbers[i] + ", ");
        }

        System.out.println();

        /*
         another output realization with one extra comma:
         for (int num : oddNumbers){
             System.out.print(num + ", ");
         }
        */

    }
}
