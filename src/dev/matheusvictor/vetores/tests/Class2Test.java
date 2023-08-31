package dev.matheusvictor.vetores.tests;

import dev.matheusvictor.vetores.Vector;

public class Class2Test {
    public static void main(String[] args) {
        Vector vector = new Vector(3);

        vector.add("uepa");
        vector.add("uepa1");
        vector.add("uepa3");
        vector.add("uepa4");
        vector.add("uepa5");
        vector.add("uepa5");

        vector.add(0, "rapaz");

        System.out.println(vector.getSize());
        System.out.println(vector);
        System.out.println(vector.search(1));
        System.out.println(vector.search("uepa4"));

        vector.remove(2);
        System.out.println(vector);

        vector.remove("rapaz");
        System.out.println(vector);
    }
}