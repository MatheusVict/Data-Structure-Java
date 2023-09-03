package dev.matheusvictor.vetores.labs;

import dev.matheusvictor.vetores.Lista;

import java.util.ArrayList;

public class Exercises {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(10);

        lista.add("oi");
        lista.add("ola");
        lista.add("olá");

        if (lista.contains("oi")) {
            System.out.println("tem papai");
        } else {
            System.out.println("tem não");
        }

        lista.remove("oi");
        lista.remove(0);

        System.out.println(lista);

        System.out.println(lista.search(0));

        lista.clear();
        System.out.println(lista);
    }
}
