package dev.matheusvictor.queue.tests;

import dev.matheusvictor.queue.Fila;

public class Test01 {
    public static void main(String[] args) {
        Fila<Integer> queue = new Fila<>();

        System.out.println(queue.isEmpty());
        System.out.println(queue.getSize());

        queue.enfileirar(1);
        queue.enfileirar(2);
        queue.enfileirar(3);

        System.out.println(queue.isEmpty());
        System.out.println(queue.getSize());
        System.out.println(queue);
    }
}
