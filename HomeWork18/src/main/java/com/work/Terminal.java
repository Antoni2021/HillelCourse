package com.work;

import java.util.Arrays;
import java.util.Random;

public class Terminal extends Thread {

    private static int sum = 50000;

    public Terminal(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true){
            int methodChoose = Arrays.asList(0, 1).get(new Random().nextInt(2));
            if (methodChoose == 0) {
                withdrawal();
            } else {
                entrance();
            }

        }
    }

    public static void increase(int increaseSum) {
        sum += increaseSum;
    }
    public static void decrease(int decreaseSum) {
        sum -= decreaseSum;
    }

    public static void withdrawal(){
        if (sum > 0) {
            int rate = (int) (Math.random() * 10000);
            if (sum - rate >= 0) {
                Terminal.decrease(rate);
                System.out.println(currentThread().getName() + ": снятие " + rate + ", осталось в терминале: " + sum);
            } else {
                System.out.println(currentThread().getName() + ": попытка снятия " + rate + ", недостаточно средств в терминале");
                Thread.yield();
            }
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void entrance() {
        int income = (int) (Math.random() * 10000);
        Terminal.increase(income);
        System.out.println(currentThread().getName() + ": поступление " + income + ", теперь в терминале: " + sum);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
