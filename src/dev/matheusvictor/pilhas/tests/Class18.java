package dev.matheusvictor.pilhas.tests;

import dev.matheusvictor.pilhas.Pilha;

import java.util.Stack;

public class Class18 {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.isEmpty());

        stack.push(5);
        stack.push(3);
        stack.push(1);

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        System.out.println(stack.peek());
    }

}
