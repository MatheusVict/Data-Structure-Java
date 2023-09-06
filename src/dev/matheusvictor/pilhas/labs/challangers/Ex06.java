package dev.matheusvictor.pilhas.labs.challangers;

import dev.matheusvictor.pilhas.Pilha;

public class Ex06 {

    public static void main(String[] args) {
        printResult("A + B");
        printResult("A + B + (C - D");
        printResult("A + B + (C - (D");
        printResult("A + B + {C - [D]");
    }

    private final static String OPEN = "([{";
    private final static String CLOSE = ")]}";

    private static void printResult(String expression) {
        System.out.println(expression + " is balanced? " + isValidBalancedSymbols(expression));
    }

    public static boolean isValidBalancedSymbols(String expression) {

        Pilha<Character> pilha = new Pilha<>();
        int index = 0;
        char symbol, top;

        while (index < expression.length()) {
            symbol = expression.charAt(index);

            if (OPEN.indexOf(symbol) > -1) {
                pilha.heap(symbol);
            } else if (CLOSE.indexOf(symbol) > -1) {
                if (pilha.isEmpty()) return false;

                top = pilha.desempilha();

                if (OPEN.indexOf(top) != CLOSE.indexOf(symbol)) return false;
            }
            index++;
        }

        return true;
    }
}
