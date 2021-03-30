package com;

public class Car {

    public double tankVolume;
    public double tankContent;
    public double fuelUse;
    public double refueled;

    public Car(int volumeFull, int volumeNow, int use){
        tankVolume = volumeFull;
        tankContent = volumeNow;
        fuelUse = use;
    }

    // определить остаток топлива по преодолении N км
    public double getTankContent(double kilometers){
        tankContent = tankVolume - getRefueling(kilometers);
        System.out.println("there are " + tankContent + " in the tank after " + kilometers + " km");
        return tankContent;
    }

    // определить сколько надо дозаправить топлива при преодолении N км*/
    public double getRefueling(double kilometers){
        return kilometers / 100 * fuelUse;
    }

    public double getRefueled(){
        return refueled;
    }
}


