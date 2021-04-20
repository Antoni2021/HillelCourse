package com.homeWork9;

public class Main {

    public static void main(String[] args) {
        LinkedCollection link = new LinkedCollection();
        link.add("numeric");
        link.add("second");
        link.add("null");
        link.add("numberic");
        link.add("third");

        System.out.println(link);
        link.delete("numeric");
        System.out.println(link);
        System.out.println(link.get(0));
        System.out.println(link.delete(2));
        System.out.println(link);

        String[] st = {"sun", "time", "str"};
        link.addAll(st);
        link.add("runtime");
        System.out.println(link);

        LinkedCollection link2 = new LinkedCollection();
        link2.add("numeric");
        link2.add("second");
        link2.add("null");
        link2.add("numberic");
        link2.add("third");
        System.out.println(link2.size());
        System.out.println(link2.contains("numeric"));
        System.out.println(link2);
        System.out.println(link.compare(link2));

        LinkedCollection unt = new LinkedCollection();
        unt.add("uenf");
        unt.add("sdde");
        link.addAll(unt);
        System.out.println(link);
        System.out.println(unt.compare(link));
        System.out.println(link.clear());

    }
}
