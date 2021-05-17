package com.work;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("введите число");
        art(sc.nextLine());
    }

    public static List<String> chooseNumber(String s) {
        return switch (s) {
            case "0" -> Nums.number0;
            case "1" -> Nums.number1;
            case "2" -> Nums.number2;
            case "3" -> Nums.number3;
            case "4" -> Nums.number4;
            case "5" -> Nums.number5;
            case "6" -> Nums.number6;
            case "7" -> Nums.number7;
            case "8" -> Nums.number8;
            case "9" -> Nums.number9;
            default -> null;
        };
    }

    public static void art(String numb) {
        List<String> numberInString = Arrays.asList(numb.split(""));
        try {
            numberInString.forEach(Integer::parseInt);
        } catch (NumberFormatException R){
            System.out.println("Вы ввели не число, попробуйте снова");
            art(new Scanner(System.in).nextLine());
            return;
        }
        String[] st = new String[5];
        Arrays.fill(st, "");
        for (int i = 0; i < 5; i++){
            for (String s : numberInString) {
                st[i] = st[i].concat(chooseNumber(s).get(i)) + " ";
            }
        }
        Arrays.stream(st).forEach(System.out::println);
    }
}

