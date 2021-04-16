package myPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> art = new ArrayList<>();
        art.add("Porto");
        art.add("drDre");
        System.out.println(art.get(0));
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(4);
        System.out.println(list.get(0));
        list.add(2, 22);
        System.out.println(list.spliterator());


    }

}
