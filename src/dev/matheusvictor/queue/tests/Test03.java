package dev.matheusvictor.queue.tests;

import dev.matheusvictor.queue.Fila;

public class Test03 {
    public static void main(String[] args) {
        Fila<Integer> queue = new Fila<>();

        queue.enfileirar(1);
        queue.enfileirar(2);
        queue.enfileirar(3);
        queue.enfileirar(4);
        queue.enfileirar(5);

        System.out.println(queue);

        System.out.println(queue.pop());

        System.out.println(queue);
    }
}
