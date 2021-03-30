package com;

public class CarService {

    public static void fullTank(Car car){
        car.refueled += car.tankVolume - car.tankContent;
        System.out.println("Inputting to the tank " + (car.tankVolume - car.tankContent) + " liters");
        car.tankContent = car.tankVolume;
    }

    // определить остаток топлива по преодолении N км
    public static void getTankContent(Car car, double kilometers) {
        car.tankContent = car.tankVolume - getRefueling(car, kilometers);
        System.out.println("there are " + car.tankContent + " in the tank after " + kilometers + " km");
    }

    // определить сколько надо дозаправить топлива при преодолении N км*/
    public static double getRefueling(Car car, double kilometers){
        return kilometers / 100 * car.fuelUse;
    }

    public static double getRefueled(Car car){
        return car.refueled;
    }
}

