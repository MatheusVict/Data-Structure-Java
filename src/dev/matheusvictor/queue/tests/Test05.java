package dev.matheusvictor.queue.tests;

import dev.matheusvictor.queue.PriorityQueue;

public class Test05 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.enfileirar(1);
        priorityQueue.enfileirar(3);
        priorityQueue.enfileirar(2);

        System.out.println(priorityQueue); // it must be 1 2 3 not 1 3 2
    }
}
