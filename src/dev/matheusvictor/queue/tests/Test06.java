package dev.matheusvictor.queue.tests;

import java.util.PriorityQueue;
import java.util.Queue;

public class Test06 {

    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>(
                (o1, o2) -> {
                    return Integer.valueOf(o1.compareTo(o2));
                }
        );

        priorityQueue.add(2);
        priorityQueue.add(1);
        priorityQueue.add(4);
        priorityQueue.add(3);
        priorityQueue.add(9);
        priorityQueue.add(5);
        priorityQueue.add(4);
        priorityQueue.add(8);
        priorityQueue.add(7);
        priorityQueue.add(6);

        System.out.println(priorityQueue);
        /* since you have a class with Comparable using method compareTO
         * OR
         * You can use a lambda comparator on PriorityQueue's constructor
         * */
    }
}
