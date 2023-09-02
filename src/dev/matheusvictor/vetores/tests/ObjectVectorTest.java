package dev.matheusvictor.vetores.tests;

import dev.matheusvictor.vetores.ObjectVector;

public class ObjectVectorTest {
    public static void main(String[] args) {
        ObjectVector objectVector = new ObjectVector(10);

        Contact c1 = new Contact("c1", "61684", "afkljdakmfdks");
        Contact c12 = new Contact("c1", "61684", "afkljdakmfdks");
        Contact c2 = new Contact("c2", "1533", "wjafoeiuvfj");
        Contact c3 = new Contact("c3", "64053", "ka~çdfjognlç");
        Contact c4 = new Contact("c4", "64053", "ka~çdfjognlç");

        objectVector.add(c1);
        objectVector.add(c2);
        objectVector.add(c3);

        System.out.println(c1.equals(c12));

        int position = objectVector.search(c2);

        if (position > -1) {
            System.out.println("element exists");
        } else {
            System.out.println("Element doesn't exist");
        }

        System.out.println("size: "+ objectVector.getSize());
        System.out.println(objectVector);
    }
}
