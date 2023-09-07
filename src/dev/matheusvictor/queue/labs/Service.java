package dev.matheusvictor.queue.labs;

import dev.matheusvictor.queue.Fila;

public class Service {
     static final int MAX_PRIORITY = 3;
    public static void main(String[] args) {
        Fila<String> regular = new Fila<>();
        Fila<String> priority = new Fila<>();

        regular.enfileirar("person 1");
        regular.enfileirar("person 2");
        regular.enfileirar("person 3");
        priority.enfileirar("Idoso 1");
        priority.enfileirar("Idoso 2");
        priority.enfileirar("Idoso 3");
        priority.enfileirar("Idoso 4");
        priority.enfileirar("Idoso 5");
        priority.enfileirar("Idoso 6");
        priority.enfileirar("Idoso 7");
        regular.enfileirar("person 4");
        regular.enfileirar("person 5");
        regular.enfileirar("person 6");
        regular.enfileirar("person 7");
        regular.enfileirar("person 8");

        while (!regular.isEmpty() || !priority.isEmpty()) {

            int cont = 0;

            while (!priority.isEmpty() && cont < MAX_PRIORITY) {
                serverPerson(priority);
                cont++;
            }

            if (!regular.isEmpty()) {
                serverPerson(regular);
            }

            if (priority.isEmpty()) {
                while(!regular.isEmpty()) {
                    serverPerson(regular);
                }
            }
        }

    }

    public static void serverPerson(Fila<String> queue) {
        String personServed = queue.pop();
        System.out.println("Served person: " + personServed);
    }
}
