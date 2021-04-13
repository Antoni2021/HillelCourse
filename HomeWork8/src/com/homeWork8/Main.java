package com.homeWork8;

public class Main {

    public static void main(String[] args) {

        StringCollection strCol = new StringCollection(6);
        System.out.println(strCol.add("time"));
        System.out.println(strCol);
        System.out.println(strCol.contain("time"));
        System.out.println(strCol.add(7, "name"));
        System.out.println(strCol.size());
        System.out.println(strCol);
        System.out.println(strCol.delete("name"));
        System.out.println(strCol);
        System.out.println(strCol.get(6));
        System.out.println(strCol.clear());
        System.out.println(strCol);

    }
}
