package dev.matheusvictor.pilhas.tests;

import dev.matheusvictor.pilhas.Pilha;

public class Class16 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        pilha.heap(1);
        pilha.heap(2);
        pilha.heap(3);
        pilha.heap(4);
        pilha.heap(5);

        System.out.println(pilha.top());
    }
}
