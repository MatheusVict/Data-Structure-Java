package dev.matheusvictor.queue.labs;

import dev.matheusvictor.queue.Fila;

import java.util.Random;

public class Ex04 {
    public static void main(String[] args) {
        Fila<Integer> queue = new Fila<>();

        for (int i=0; i<10; i++) {
            queue.enfileirar(i);
        }

        Random random = new Random();
        int num = 0;
        while (num == 0) {
            num = random.nextInt(10);
        }

        System.out.println("NUmber: " + num);

        while (queue.getSize() > 1) {
            for (int i=0; i<num; i++) {
                queue.enfileirar(queue.pop());
            }
            System.out.println("elimida " + queue.pop());
        }

        System.out.println("ganhador: " + queue.pop());
    }
}
