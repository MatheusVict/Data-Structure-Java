package dev.matheusvictor.pilhas.labs;

import dev.matheusvictor.pilhas.Book;
import dev.matheusvictor.pilhas.Pilha;

public class Ex03 {
    public static void main(String[] args) {
        Pilha<Book> pilha = new Pilha<Book>();

        Book book1 = new Book("fausta1", "faustao", 1, "faustao");
        Book book2 = new Book("faustao2", "faustao", 2, "faustao");
        Book book3 = new Book("faustao3", "faustao", 3, "faustao");
        Book book4 = new Book("faustao4", "faustao", 4, "faustao");
        Book book5 = new Book("faustao5", "faustao", 5, "faustao");
        Book book6 = new Book("faustao6", "faustao", 6, "faustao");

        System.out.println("Is book stack empty?: " + pilha.isEmpty());

        System.out.println("Creating stack...");

        pilha.heap(book1);
        pilha.heap(book2);
        pilha.heap(book3);
        pilha.heap(book4);
        pilha.heap(book5);
        pilha.heap(book6);

        System.out.println("Stack size: " + pilha.getSize());
        System.out.println(pilha);

        System.out.println("Is book stack empty?: " + pilha.isEmpty());

        System.out.println("Desempilhando books");

        while (!pilha.isEmpty()) {
            System.out.println("desempilhando books" + pilha.desempilha());
        }

        System.out.println("Every book exclude, is empty? " + pilha.isEmpty());
    }
}
