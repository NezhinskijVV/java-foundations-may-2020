package collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Andrey");
        names.add("Sergei");

        System.out.println("names.size() = " + names.size());
        System.out.println("names.add(\"Sergei\") = " + names.add("Sergei"));

        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();




    }
}
