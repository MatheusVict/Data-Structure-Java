package dev.matheusvictor.pilhas.labs;

import dev.matheusvictor.pilhas.Pilha;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("number  bro");
            int number = scanner.nextInt();

            if (number == 0) {
                // pilha par

                Integer desempilhado = par.desempilha();

                if (desempilhado == null) System.out.println("pilha vazia");

                else System.out.println("desempilhando da pilha par: " + desempilhado);

                // pilha par

                desempilhado = impar.desempilha();

                if (desempilhado == null) System.out.println("pilha vazia");

                else System.out.println("desempilhando da pilha impar: " + desempilhado);

            } else if (number % 2 == 0) {
                System.out.println("Par na pilha par");
                par.heap(number);
            } else {
                System.out.println("Impar na pilha impar");
                impar.heap(number);
            }
        }

        System.out.println("Desempilhando todos os números da puilha par");

        while (!par.isEmpty()) {
            System.out.println("Desenpilhando da pilha par " + par.desempilha());
        }

        System.out.println("Desempilhando todos os números da puilha impar");

        while (!impar.isEmpty()) {
            System.out.println("Desenpilhando da pilha impar " + impar.desempilha());
        }
    }
}
