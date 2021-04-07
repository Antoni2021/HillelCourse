package com.homeWork;

public interface Information {

    void longerCityCalls(PhonesMass phonesMass, int time);

    void useInterCalls(PhonesMass phonesMass);

    void alphabetContacts(PhonesMass phonesMass);

    void biggestInterUsers(PhonesMass phonesMass) throws CloneNotSupportedException;

    default void call(PhonesMass phonesMass){
        System.out.println(phonesMass.getArr());
    }

}
