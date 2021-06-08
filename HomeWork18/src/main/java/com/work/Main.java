/*Написать мини приложение банкомат, которое работает в нескольких потоках, каждый поток может класть и снимать
определенную сумму сумму из банкомата,

        каждая транзакция должна выводиться на экран в формате: поток - снятие/пополнение - сумма*/

package com.work;

public class Main {

    public static void main(String[] args) {

        Thread terminal1 = new Terminal("Thread 1");
        Thread terminal2 = new Terminal("Thread 2");
        Thread terminal3 = new Terminal("Thread 3");
        Thread terminal4 = new Terminal("Thread 4");
        terminal1.start();
        terminal3.start();
        terminal2.start();
        terminal4.start();
//        Thread thread1 = new Withdrawal("Thread 1");
//        Thread thread4 = new Withdrawal("Thread 4");
//        Entrance thread2 = new Entrance("Thread 2");
//        Entrance thread3 = new Entrance("Thread 3");
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();



    }
}
