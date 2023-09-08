package dev.matheusvictor.lista.tests;

import dev.matheusvictor.lista.ListaEncadeada;

public class Test01 {
    public static void main(String[] args) {
        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();

        listaEncadeada.add(1);
        System.out.println(listaEncadeada);

        listaEncadeada.add(2);
        System.out.println(listaEncadeada);

        listaEncadeada.add(3);
        System.out.println(listaEncadeada);

        /*
        * 1,
        * 1,2
        * 1,2,3
        * */


        System.out.println(listaEncadeada.size());

        listaEncadeada.clean();
        System.out.println(listaEncadeada);

    }
}
