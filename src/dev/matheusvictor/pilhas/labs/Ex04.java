package dev.matheusvictor.pilhas.labs;

import dev.matheusvictor.pilhas.Book;

import java.util.Stack;

public class Ex04 {

    public static void main(String[] args) {
        Stack<Book> books = new Stack<>();

        Book book1 = new Book("fausta1", "faustao", 1, "faustao");
        Book book2 = new Book("faustao2", "faustao", 2, "faustao");
        Book book3 = new Book("faustao3", "faustao", 3, "faustao");
        Book book4 = new Book("faustao4", "faustao", 4, "faustao");
        Book book5 = new Book("faustao5", "faustao", 5, "faustao");
        Book book6 = new Book("faustao6", "faustao", 6, "faustao");

        System.out.println("IS empty? " + books.isEmpty());

        books.push(book1);
        books.push(book2);
        books.push(book3);
        books.push(book4);
        books.push(book5);
        books.push(book6);

        System.out.println(books.size() + " books");

        System.out.println(books);

        System.out.println("is empty? " + books.isEmpty());

        System.out.println("top " + books.peek());

        System.out.println("Desempilhando books");

        while (!books.isEmpty()) {
            System.out.println("desempilhando books" + books.pop());
        }

        System.out.println("Every book exclude, is empty? " + books.isEmpty());
    }
}
