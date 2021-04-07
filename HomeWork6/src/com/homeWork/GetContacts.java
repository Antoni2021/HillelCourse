package com.homeWork;

public class GetContacts implements Information {

    // сведения об абонентах, у которых время внутригородских разговоров превышает заданное;
    @Override
    public void longerCityCalls(PhonesMass phonesMass, int time) {
        System.out.println("Next phones has inner calls time, bigger than " + time + " minutes:");
        for (Phone ph : phonesMass.getArr()){
            if (ph != null && ph.getTownCalls() > time) {
                System.out.println(ph);

            }
        }
        System.out.println();
    }

    // сведения об абонентах, которые пользовались междугородной связью;
    @Override
    public void useInterCalls(PhonesMass phonesMass) {
        System.out.println("Next phones used international calls: ");
        for (Phone ph : phonesMass.getArr()){
            if (ph != null && ph.getInterCalls() !=0) {
                System.out.println(ph);
            }
        }
        System.out.println();
    }

    //сведения об абонентах в алфавитном порядке.
    @Override
    public void alphabetContacts(PhonesMass phonesMass) {

        System.out.println("Phones names in alphabet:");
        for (int i = 97; i < 122; i++) {
            for (Phone ph : phonesMass.getArr()) {
                if (ph != null && ph.getName() != null &&
                        ph.getName().toLowerCase().startsWith(String.valueOf((char) (i)))) {
                    System.out.println(ph);
                }
            }
        }
        System.out.println();

    }

    // сведения об первых 10 абонентов у который самый большой трафик интернета
    @Override
    public void biggestInterUsers(PhonesMass phonesMass) throws CloneNotSupportedException {
        int leng = 0;
        if (phonesMass.getArr().length > 10) {
            System.out.println("Next 10 phones used max internet volume:");
            leng = 10;
        } else {
            leng = phonesMass.getArr().length;
            System.out.println("Next " + leng + " phones used max internet volume:");
        }
        PhonesMass ci = (PhonesMass) phonesMass.clone();
        for (int i = 0; i < leng; i++) {
            int max = 0;
            int number = 0;
            for (int n = 0; n < phonesMass.getArr().length; n++) {
                if (ci.getArr() != null && ci.getArr()[n].getInternet() != 0 && ci.getArr()[n].getInternet() > max) {
                    max = ci.getArr()[n].getInternet();
                    number = n;
                }
            }
            System.out.println(phonesMass.getArr()[number]);
            ci.getArr()[number].setInternet(0);
        }
        System.out.println();
    }
}
