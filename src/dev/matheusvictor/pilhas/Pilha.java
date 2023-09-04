package dev.matheusvictor.pilhas;

import dev.matheusvictor.data.StaticStructure;

import java.util.Arrays;

public class Pilha<T> extends StaticStructure<T> {

    public Pilha(int size) {
        super(size);
    }

    public Pilha() {
        super();
    }


    public void heap(T element) {
        super.increaseCapacity();

        super.add(element);
    }


}
