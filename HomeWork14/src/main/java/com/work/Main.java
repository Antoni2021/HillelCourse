package com.work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(Nums.number1.get(0));
        System.out.println();
        int number = 10001;
        System.out.println(chooseNumber("0"));
        int len = 0;
        List<String> numberInString = Arrays.asList((number + "").split(""));
//        numberInString.stream()
//                .map(s -> chooseNumber(s))
//                .forEach();
        List<String> result;
        String[] st = new String[numberInString.size()];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < numberInString.size(); j++){
                st[i] = st[i].concat(chooseNumber(numberInString.get(j)).get(i)) + " ";
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(st[i]);
        }

//        for (int i = 0; i < numberInString.size(); i++){
//            st = st.concat(chooseNumber(numberInString.get(i)).get(0)) + " ";
//        }
//        for (int i = 0; i < numberInString.size(); i++){
//            st2 = st2.concat(chooseNumber(numberInString.get(i)).get(1) + " ");
//        }
//        System.out.println(st);
//        System.out.println(st2);

//    for (int i = 0; i < numberInString.size(); i++){

//        numberInString.stream().map(u -> {
//            if (u.equals("0")){
//                u = Nums.num0;
//            } else if (u.equals("1")){
//                u = Nums.num1;
//            }
//        });
//        numberInString.
//        String[][] str = new String[5][6];
        System.out.println();

    }

    public static List<String> chooseNumber(String s) {
        switch (s) {
            case "0":
                return Nums.number0;
            case "1":
                return Nums.number1;
            case "2":
                return Nums.number2;
            case "3":
                return Nums.number3;
            case "4":
                return Nums.number4;
            case "5":
                return Nums.number5;
            case "6":
                return Nums.number6;
            case "7":
                return Nums.number7;
            case "8":
                return Nums.number8;
            case "9":
                return Nums.number9;
            default:
                return null;
        }

    }
}

//    public static void add(ArrayList<String[]> array, String[] num){
//        for(int i = 0; i < 5; i++){
//            array[i] = array[i] + num;
//        }
//    }

