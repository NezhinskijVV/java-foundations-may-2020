package collections.lists.myarraylist;

import java.util.ArrayList;

public class MyArrayListRunner {

    public static void main(String[] args) {
//        final ArrayList arrayList = new ArrayList();
//        arrayList.add("Строка1");
//        arrayList.add("Строка2");
//        arrayList.add("Строка3");
//        arrayList.add("Строка1");
//
//        System.out.println("arrayList.get(0) = " + arrayList.get(0));
//        System.out.println("arrayList.size() = " + arrayList.size());
//        arrayList.remove("Строка1");
//        System.out.println("arrayList.size() = " + arrayList.size());


        MyArrayList list = new MyArrayList();
        list.add("Строка 1");
        list.add("Строка 2");
        list.add("Строка 3");

        list.add("Строка");
        list.add("Строка");
        list.add("Строка");

        list.add("Строка");
        list.add("Строка");
        list.add("Строка");

        list.add("Строка");
        list.add("Строка");
        list.add("Строка 12");


        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.get(11) = " + list.get(11));
//        System.out.println("list.get(12) = " + list.get(12));

        list.remove("Строка 1");
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.size() = " + list.size());

        System.out.println(list.remove("Строка 12"));
        System.out.println("list.size() = " + list.size());



    }
}
