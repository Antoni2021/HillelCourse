package com.homeWork;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        GetContacts ui = new GetContacts();
        Phone pony = new Phone(10, "Potapov", "Potap", "Potapovich", "Semaphornaya",
                "0606005004", "2555 4442 0111 3565", 25000, 12000,
                8, 65, 2500);
        Phone cody = new Phone(12, "Kostylev", "Viktor", "Gennadievich", "Odessa",
                "0699662521", "2315 5442 0111 3311", 2000, 42000,
                259, 2, 25000);
        Phone krator = (Phone) pony.clone();
        krator.setId(14);
        krator.setName("Alex");
        krator.setInternet(13650);


        Phone[] tableIn = {pony, cody, krator};
        PhonesMass table = new PhonesMass(tableIn);

        ui.longerCityCalls(table, 25);
        ui.useInterCalls(table);
        ui.alphabetContacts(table);
        ui.biggestInterUsers(table);


    }

}
