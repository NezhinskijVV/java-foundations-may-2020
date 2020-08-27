package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

    public static void main(String[] args) {
        Map<Man, String> map = new HashMap<>();
        Man sidorov = new Man("Сидоров");
        Man ivanov = new Man("Иванов");

        map.put(sidorov, "Свитшот");
        map.put(ivanov, "Юбка");

        System.out.println("map.get(sidorov) = " + map.get(sidorov));

        //получить Юбку
        System.out.println("map.get(ivanov) = " + map.get(ivanov));

//        sidorov = new Man("Джавов");
//
//        System.out.println("map.get(sidorov) = " + map.get(sidorov));

        for (Man key : map.keySet()) {
            System.out.print("man: " + key + " <-> item: " + map.get(key) + " ");
        }
        System.out.println();

        for (Map.Entry<Man, String> pair : map.entrySet()) {
            System.out.print("man: " + pair.getKey() + " <-> item: " + pair.getValue() + " ");
        }
        System.out.println();

        map.remove(sidorov);

        System.out.println("After remove Sidorov");
        for (Man key : map.keySet()) {
            System.out.print("man: " + key + " <-> item: " + map.get(key) + " ");
        }
        System.out.println();

        System.out.println("map.size() = " + map.size());

        "si".toString();


    }
}