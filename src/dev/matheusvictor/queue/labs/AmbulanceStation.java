package dev.matheusvictor.queue.labs;

import dev.matheusvictor.queue.Fila;
import dev.matheusvictor.queue.PriorityQueue;

public class AmbulanceStation {

    private static final int GREEN = 2;
    private static final int YELLOW = 1;
    private static final int RED = 0;

    public static void main(String[] args) {
        PriorityQueue<Person> queue = new PriorityQueue<>();

        queue.enfileirar(new Person("1", GREEN));
        queue.enfileirar(new Person("2", RED));
        queue.enfileirar(new Person("3", GREEN));
        queue.enfileirar(new Person("4", YELLOW));
        queue.enfileirar(new Person("5", YELLOW));
        queue.enfileirar(new Person("5", RED));

        ASService service = new ASService(queue);
        ASNewPatients patients = new ASNewPatients(queue);

        Thread customThread = new Thread(service); // you can pass any object implemented with Runnable
        Thread customThread2 = new Thread(patients); // you can pass any object implemented with Runnable

        customThread.start();
        customThread2.start();
    }


}
