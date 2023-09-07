package dev.matheusvictor.queue;

import dev.matheusvictor.data.StaticStructure;

public class Fila<T> extends StaticStructure<T> {
    public Fila(int capacity) {
        super(capacity);
    }

    public Fila() {
        super(10);
    }
}
