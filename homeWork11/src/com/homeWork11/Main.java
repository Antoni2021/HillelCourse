package com.homeWork11;

public class Main {

    public static void main(String[] args) {
        Return ret = new Return(0, "srer", 5.5);
        System.out.println(ret.string());
        System.out.println(ret);
        Return ret1 = new Return(0, "srer", 5.5);
        System.out.println(ret.equals(ret1));

//        int[][] numbers = new int[10][3];
//        System.out.println(numbers[2][7]);

        String longString = """
                There is a big long
                message that i can write
                in one text block \
                without any additional 
                symbols 
                """;
        System.out.println(longString);

        User ivan = new User("Ivan", 258);
        ivan.setName("Victor");
        System.out.println(ivan);
    }
}
