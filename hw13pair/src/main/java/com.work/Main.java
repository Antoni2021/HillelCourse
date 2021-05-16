package com.work;

import javafx.util.Pair;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Pair<String, String> p1 = new Pair<>("new", "world");
        System.out.println(p1);
        List<String> r1 = Arrays.asList("Mama", "Brother", "java", "simple", "TROUBLE", "world");
        System.out.println(r1);
        System.out.println(maps(r1));

    }

    public static List<Pair<String, String>> maps(Collection<String> collection) {
        ArrayList<Pair<String, String>> st = new ArrayList<>();
        return collection.stream()
                .map(s -> new Pair<>(s.toLowerCase(Locale.ROOT), s.toUpperCase(Locale.ROOT)))
                .collect(Collectors.toList());
//        System.out.println(st);

    }
}


//    @Test
//    public void testMaps() {
//        Assertions.assertEquals([mama=MAMA, brother=BROTHER, java=JAVA, simple=SIMPLE, trouble=TROUBLE, world=WORLD],
//                Streams.maps(List.of("Mama", "Brother", "java", "simple", "TROUBLE", "world")));
//    }