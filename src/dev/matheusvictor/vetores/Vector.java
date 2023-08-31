package dev.matheusvictor.vetores;

public class Vector {
    private String[] elements;
    private int size;

    public Vector(int capacity) {
        this.elements = new String[capacity];
        this.size = 0;
    }

    /*public void add(String element) {
        for (int i = 0; i < this.elements.length; i++) {
            if (elements[i] == null) {
                elements[i] = element;
                break;
            }
        }
    }*/

    /*public void add(String element) throws Exception {
        if (this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
        } else {
            throw new Exception("Vector full");
        }
    } */

    public String search(int position) {
        if (!(position >= 0 && position < size)) {
            throw new IllegalArgumentException("invalid position");
        }
        return this.elements[position];
    }

    public int search(String element) {
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    // Adding by element
    public boolean add(String element) {
        this.increaseCapacity();
        if (this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
            return true;
        }
        return false;
    }


    // add in a position
    public boolean add(int position, String element) {
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

    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        for (int i = 0; i < this.size; i++) {
            stringBuilder.append(this.elements[i]);
            stringBuilder.append(", ");
        }

        if (this.size > 0) {
            stringBuilder.append(this.size - 1);
        }

        stringBuilder.append("]");

        return stringBuilder.toString();
    }

    private void increaseCapacity() {
        if (this.size == this.elements.length) {
            String[] NewsElements = new String[this.elements.length * 2];
            for (int i=0; i<this.elements.length; i++) {
                NewsElements[i] = this.elements[i];
            }
            this.elements = NewsElements;
        }
    }
}
