package dev.matheusvictor.queue;

public class PriorityQueue<T> extends Fila<T> {

    @Override
    public void enfileirar(T element) {
        Comparable<T> key = (Comparable<T>) element;

        int i;

        for (i=0; i<this.size; i++) {
            if (key.compareTo(this.elements[i]) < 0) {
                break;
            }
        }
        this.add(i, element);
    }
}
