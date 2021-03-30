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
        toyota.getTankContent(odessaOzero);
        CarService.fullTank(toyota);

        System.out.println();
        System.out.println("riding from Krivoye Ozero to Zhashkiv, 153km");
        toyota.getTankContent(ozeroZhashkiv);
        CarService.fullTank(toyota);

        System.out.println();
        System.out.println("riding from Zhashkiv to Kiev, 150km");
        toyota.getTankContent(zhashkivKiev);


        System.out.println();
        System.out.println("all inputted fuel for this trip is  " + toyota.getRefueled() + "l ");
        if (args.length != 0){
            int cost = Integer.parseInt(args[0]);
            System.out.println("for this trip it`s need to spend " + (toyota.getRefueled() * cost) + " uah");
        } else {
            System.out.println("If the price for gas costs 20 uah, you spend for this trip " +
                    (toyota.getRefueled() * 20) + " uah");
        }

    }

}
