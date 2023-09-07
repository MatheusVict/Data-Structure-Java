package dev.matheusvictor.queue.tests;

import dev.matheusvictor.queue.Fila;

public class Test02 {

    public static void main(String[] args) {
        Fila<Integer> queue = new Fila<>();

        queue.enfileirar(0);
        queue.enfileirar(2);
        queue.enfileirar(3);
        queue.enfileirar(4);

        System.out.println(queue.peek());
    }
}
