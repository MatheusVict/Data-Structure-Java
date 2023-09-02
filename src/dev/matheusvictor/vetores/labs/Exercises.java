package dev.matheusvictor.vetores.labs;

import dev.matheusvictor.vetores.Lista;

public class Exercises {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(10);

        lista.add("oi");
        lista.add("ola");

        if (lista.contains("oi")) {
            System.out.println("tem papai");
        } else {
            System.out.println("tem não");
        }
    }
}
