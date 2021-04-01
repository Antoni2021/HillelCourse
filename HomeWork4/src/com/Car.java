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
    
}


