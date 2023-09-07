package dev.matheusvictor.queue.labs;

import dev.matheusvictor.queue.PriorityQueue;

import java.util.Random;

public class ASNewPatients implements Runnable {
    private PriorityQueue<Person> queue;
    private int cont = 7;
    private Random priority = new Random();

    public ASNewPatients(PriorityQueue<Person> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 8; i++) {
            try {
                Thread.sleep(8000);
                Person person = new Person("" + cont, priority.nextInt(3));
                queue.enfileirar(person);
                cont++;
                System.out.println(person + "added");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
