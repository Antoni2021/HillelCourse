package com.work;

import javafx.util.Pair;

import java.util.*;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {


        Pair<String, String> p1 = new Pair<>("new", "world");
        System.out.println(p1.getClass());
        List<String> r1 = Arrays.asList("Mama", "Brother", "java", "simple", "TROUBLE", "world");
        System.out.println(r1);
        System.out.println(maps(r1).getClass());
        /*
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 25, 12, 13, 45, 74);
        List<String> strings = List.of("Mama", "Brother", "java", "simple", "TROUBLE", "world");

        strings.stream()
               .filter(s -> s.length() == 4 && s.equals(s.toLowerCase()))
               .forEach(s -> System.out.print(s + " "));

        System.out.println(filtred(strings));

        System.out.println();
        strings.stream()
//              .map(s -> s.toUpperCase(Locale.ROOT))
               .collect(Collectors.toMap(s -> s.toLowerCase(Locale.ROOT), s -> s.toUpperCase(Locale.ROOT)))
               .forEach((k,v) -> System.out.print("{" + k + ":" + v + "}, "));
        strings.stream()
               .map(s -> "{" + s.toLowerCase(Locale.ROOT) + ":" + s.toUpperCase(Locale.ROOT) + "}")
               .forEach(s -> System.out.print(s + ", "));


        System.out.println();
        System.out.println(maps(strings));

        System.out.println();
        System.out.println(average(integers));
        */

    }
    public static double average(Collection<Integer> collection){
        return collection.stream()
                         .mapToDouble(i -> i)
                         .average().orElse(-1);
    }

//    public static Map<String, String> maps(Collection<String> collection){
//        return collection.stream()
//                         .collect(Collectors.toMap(s -> s.toLowerCase(Locale.ROOT), s -> s.toUpperCase(Locale.ROOT)));
//    }

    public static List<Pair<String, String>> maps(Collection<String> collection) {
        return collection.stream()
                .map(s -> new Pair<>(s.toLowerCase(Locale.ROOT), s.toUpperCase(Locale.ROOT)))
                .collect(Collectors.toList());
    }

    public static List<String> filtred(Collection<String> collection){
        return collection.stream()
                .filter(s -> s.length() == 4 && s.equals(s.toLowerCase()))
                .collect(Collectors.toList());
    }


}
