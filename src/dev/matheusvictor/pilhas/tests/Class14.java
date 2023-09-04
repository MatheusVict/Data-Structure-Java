package dev.matheusvictor.pilhas.tests;

import dev.matheusvictor.pilhas.Pilha;

public class Class14 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        for (int i = 1; i <= 10; i++) {
            pilha.heap(i);
        }

        System.out.println(pilha);
        System.out.println(pilha.getSize());
    }
}
