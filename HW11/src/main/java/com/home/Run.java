package com.home;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Random;

public class Run {
    public static void main(String[] args) {
        System.out.println("Start maven program");

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
        User petya = new User().setName("Petya").setNumber(3265).setName("Tolik");
        ivan.setName("Victor");
        System.out.println(ivan);
        System.out.println(petya);
        String password = RandomStringUtils.random(7, true, true);
        System.out.println(password);
    }
}
