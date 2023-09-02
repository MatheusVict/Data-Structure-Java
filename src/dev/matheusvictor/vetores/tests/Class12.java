package dev.matheusvictor.vetores.tests;

import java.util.ArrayList;

public class Class12 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("c");
        arrayList.add("a");
        arrayList.add(0, "hello");

        System.out.println(arrayList);

        // if contains in array
        boolean exists = arrayList.contains("a");
        if (exists) {
            System.out.println("element exists");
        } else {
            System.out.println("element doesn't exists");
        }

        // get index and get by index
        System.out.println(arrayList.indexOf("a"));
        System.out.println(arrayList.get(2));

        // remove
        arrayList.remove(2);
        arrayList.remove("a");

        System.out.println(arrayList);

        // size
        System.out.println(arrayList.size());
    }
}
