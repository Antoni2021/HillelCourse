/* Напишите метод, который на вход получает коллекцию объектов,
 * а возвращает коллекцию уже без дубликатов.
 */
package com.homeWork10;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> ans = new LinkedList<>();
        ans.add("Anton");
        ans.add("Julia");
        ans.add("Tung");
        ans.add("Tung");
        ans.add("Tung");
        ans.add("Tung");
        ans.add("Dasha");
        ans.add("Rita");
        ans.add("Vova");
        ans.add("Vova");

        System.out.println(ans);
        System.out.println(cleanCollection(ans));
        System.out.println(ans);
    }

    public static Collection cleanCollection(Collection collect){
        Set<Object> sun = new HashSet<>();
        Iterator iterator = collect.iterator();
        while (iterator.hasNext()){
            sun.add(iterator.next());
        }
        iterator.remove();
        return sun;
    }
}
