package dev.matheusvictor.queue;

import dev.matheusvictor.data.StaticStructure;

import java.util.Arrays;

public class Fila<T> extends StaticStructure<T> {
    public Fila(int capacity) {
        super(capacity);
    }

    public Fila() {
        super(10);
    }

    public void enfileirar(T element) {
        this.add(element);
    }

    public T peek() {
        return this.elements[0];
    }

}
