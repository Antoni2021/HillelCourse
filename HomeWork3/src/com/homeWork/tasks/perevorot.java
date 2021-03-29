package com.homeWork.tasks;

public class perevorot {

    public static void main(String[] args) {

        int num = 21551554;
        String[] in = (num + "").split("");
        for (String el: in) {
            System.out.print(el + "");
        }
        System.out.println();
        String[] out = new String[in.length];
        String output = "";
        for (int i = in.length - 1; i >= 0; i--){
            output = output.concat(in[i]);
        }
        System.out.println(output);


        int sum = Integer.parseInt(in[0]) + Integer.parseInt(in[in.length - 1]);
        System.out.println(sum);
    }
}
