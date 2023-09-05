package dev.matheusvictor.pilhas.labs;

import dev.matheusvictor.pilhas.Pilha;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();

        Scanner scanner = new Scanner(System.in);

        // Every par number before a impar number is desempilhado
        for (int i = 1; i <= 10; i++) {
            System.out.println("Entre com um número");

            int number = scanner.nextInt();

            if (number % 2 == 0) {
                pilha.heap(number);
            } else {
                Integer desempilhado = pilha.desempilha();
                if (desempilhado == null) {
                    System.out.println("Pilha is empty");
                } else System.out.println("impar number, desempilhando " + desempilhado);
            }
        }

        System.out.println("All numbers read, desempilhando now");

        while (!pilha.isEmpty()) {

            System.out.println("impar number " + pilha.desempilha());
        }

        System.out.println("Every element desempilhado");
    }
}
