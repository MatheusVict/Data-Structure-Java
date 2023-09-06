package dev.matheusvictor.pilhas.labs.challangers;

import dev.matheusvictor.pilhas.Pilha;

public class Ex05 {

    public static void main(String[] args) {
        System.out.println(isPalindromo("ADA"));
        System.out.println(isPalindromo("ABCCBA"));
    }

    public static boolean isPalindromo(String word) {

        Pilha<Character> pilha = new Pilha<>();

        for (int i = 0; i < word.length(); i++) {
            pilha.heap(word.charAt(i));
        }

        String reverseWord = "";

        while (!pilha.isEmpty()) {
            reverseWord += pilha.desempilha();
        }

        if (reverseWord.equalsIgnoreCase(word)) return true;
        else return false;

        /*
        * StringBuilder reverseWord = new StringBuilder();

        while (!pilha.isEmpty()) {
            reverseWord.append(pilha.desempilha());
        }
        * */


    }
}
