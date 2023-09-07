package dev.matheusvictor.queue.labs;

import dev.matheusvictor.queue.PriorityQueue;

public class ASService implements Runnable {
    private PriorityQueue<Person> queue;

    public ASService(PriorityQueue<Person> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (!queue.isEmpty()) {
            try {
                System.out.println(queue.pop() + " served");
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Served with success");
    }
}
