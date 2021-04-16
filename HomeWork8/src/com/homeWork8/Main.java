package com.homeWork8;

public class Main {

    public static void main(String[] args) {
        StringCollection strCol = new StringCollection(6);
        System.out.println(strCol.delete(3));
        System.out.println(strCol);
        System.out.println(strCol.size());
        System.out.println(strCol.add("time"));
        System.out.println(strCol.add(6, "name"));
        System.out.println(strCol.size());
        System.out.println(strCol);
        System.out.println("-----------------");
        System.out.println(strCol.contain("ty"));
        System.out.println(strCol.delete("name"));
        System.out.println(strCol);
        System.out.println(strCol.get(5));
        System.out.println(strCol.clear());
        System.out.println(strCol);

    }
}
