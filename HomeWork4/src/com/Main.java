/*
      в классе Мейн надо определить и вывести на экран сколько надо долить топлива и его стоимость если маршрут у нас Одесса - Киев
        + 2 обязательные остановки для дозаправки Кривое Озеро и Жашков
        + сколько будет стоить полная поездка
        + остаток топлива в пункте назначения
        стоимость топлива передавать как аргумент программы + результаты выполнения приложить скриншотом
*/
package com;

public class Main {

    public static void main(String[] args) {

        // initialization car toyota with 30l in the tank
        Car toyota = new Car(40, 30, 9);
        toyota.fullTank(toyota.tankContent);

        System.out.println();
        System.out.println("riding from Odessa to Krivoye Ozero, 180km");
        toyota.fullTank(toyota.getTankContent(180));

        System.out.println();
        System.out.println("riding from Krivoye Ozero to Zhashkiv, 153km");
        toyota.fullTank(toyota.getTankContent(153));

        System.out.println();
        System.out.println("riding from Zhashkiv to Kiev, 150km");
        toyota.getTankContent(150);


        System.out.println();

        System.out.println("all inputted fuel for this trip is  " + toyota.getRefueled());
        System.out.println("for this trip it`s need to spend " + (toyota.getRefueled() * Integer.parseInt(args[0])) +
                " uah");

    }

}
