package com.homeWork7;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StringCollection str = new StringCollection(5);
        StringCollection sc = new StringCollection();
        System.out.println(str);
        System.out.println(str.add(4, "System"));
        System.out.println(str);
        System.out.println(str.add("Magnum"));
        System.out.println(str);
        System.out.println(str.delete(2));
        System.out.println(str);
        System.out.println(str.delete("4"));
        System.out.println(str);
        System.out.println(str.get(2));
        System.out.println("---------------");

        System.out.println(sc);
        System.out.println(sc.add(4, "System"));
        System.out.println(sc);
        System.out.println(sc.add("Magnum"));
        System.out.println(sc);
        System.out.println(sc.delete(2));
        System.out.println(sc);
        System.out.println(sc.delete("Magnum"));
        System.out.println(sc);
        System.out.println(sc.get(2));

    }
}
