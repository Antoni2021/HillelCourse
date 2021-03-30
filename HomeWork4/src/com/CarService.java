package com;

public class CarService {

    public static void fullTank(Car car){
        car.refueled += car.tankVolume - car.tankContent;
        System.out.println("Inputting to the tank " + (car.tankVolume - car.tankContent) + " liters");
        car.tankContent = car.tankVolume;
    }

}

