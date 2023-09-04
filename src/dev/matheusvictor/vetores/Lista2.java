package dev.matheusvictor.vetores;

import dev.matheusvictor.data.StaticStructure;

public class Lista2<T> extends StaticStructure<T> {
    public Lista2() {
        super();
    }

    public Lista2(int capacity) {
        super(capacity);
    }

    @Override
    public boolean add(T element) {
        return super.add(element);
    }

    @Override
    public boolean add(int position, T element) {
        return super.add(position, element);
    }
}
