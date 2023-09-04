package dev.matheusvictor.data;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StaticStructure<T> {
    private T[] elements;
    private int size;

    public StaticStructure(int capacity) {
        this.elements = (T[]) new Object[capacity];
        this.size = 0;
    }

    public StaticStructure() {
        this(10);
    }

    public int getSize() {
        return this.size;
    }

    protected boolean add(T element) {
        this.increaseCapacity();
        if (this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
            return true;
        }
        return false;
    }

    protected boolean add(int position, T element) {
        this.increaseCapacity();
        if (!(position >= 0 && position < size)) {
            throw new IllegalArgumentException("invalid position");
        }

        // get index from that position and continue doing that until get the position passed
        for (int i = size - 1; i >= position; i--) {
            /*
             next element receive anterior: add(0, hello)
              [a, b, c, null] ->
               [a, b, c, c] -> [a, b, b, c] -> [a, a, b, c] -> [hello, a, b, c]
            * */
            this.elements[i + 1] = this.elements[i];
        }
        this.elements[position] = element;
        this.size++;
        return false;
    }

    private void increaseCapacity() {
        if (this.size == this.elements.length) {
            T[] NewsElements = (T[]) new Object[this.elements.length * 2];
            for (int i = 0; i < this.elements.length; i++) {
                NewsElements[i] = this.elements[i];
            }
            this.elements = NewsElements;
        }
    }

    @Override
    public String toString() {
        return "StaticStructure{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}