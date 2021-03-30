package com;

public class Main {

    public static void main(String[] args) {

        int odessaOzero = 180;
        int ozeroZhashkiv = 153;
        int zhashkivKiev = 150;

        // initialization car toyota with 30l in the tank
        Car toyota = new Car(40, 30, 9);
        CarService.fullTank(toyota);

        System.out.println();
        System.out.println("riding from Odessa to Krivoye Ozero, 180km");
        CarService.getTankContent(toyota, odessaOzero);
        CarService.fullTank(toyota);

        System.out.println();
        System.out.println("riding from Krivoye Ozero to Zhashkiv, 153km");
        CarService.getTankContent(toyota, ozeroZhashkiv);
        CarService.fullTank(toyota);

        System.out.println();
        System.out.println("riding from Zhashkiv to Kiev, 150km");
        CarService.getTankContent(toyota, zhashkivKiev);


        System.out.println();
        System.out.println("all inputted fuel for this trip is  " + CarService.getRefueled(toyota) + "l ");
        if (args.length != 0){
            int cost = Integer.parseInt(args[0]);
            System.out.println("for this trip it`s need to spend " + (CarService.getRefueled(toyota) * cost) + " uah");
        } else {
            System.out.println("If the price for gas costs 20 uah, you spend for this trip " +
                    (CarService.getRefueled(toyota) * 20) + " uah");
        }

    }

}
