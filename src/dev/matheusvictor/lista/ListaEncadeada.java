package dev.matheusvictor.lista;

public class ListaEncadeada<T> {
    private No<T> start;
    private No<T> end;
    private int size = 0;

    public void add(T element) {
        // you add a new element
        No<T> cell = new No<T>(element);

        // if there're nothing you just add this element on start
        if (this.size == 0) this.start = cell;

            // else you add this at the final element on attribute next
            /*
             * Example
             *
             * ListaEncadeada{
             *   start=No{
             *       element=1,
             *       next=No{
             *           element=2,
             *           next=No{
             *               element=3,
             *               next=null
             *              }
             *          }
             *      }
             *  }
             * */
        else this.end.setNext(cell);

        this.end = cell;
        this.size++;
    }

    public int size() {
        return this.size;
    }

    public void clean() {
        for (No<T> current = this.start; current != null;) {
            No<T> next = current.getNext();

            current.setElement(null);
            current.setNext(null);
            current = next;
            this.size--;
        }
    }


    @Override
    public String toString() {
        // [1, 2, 3, 4]
        if (this.size == 0) return "[]";

        StringBuilder builder = new StringBuilder();

        No<T> current = this.start;
        for (int i = 0; i < this.size; i++) {
            builder.append(current.getElement()).append(", ");
            current = current.getNext();
        }

        return builder.deleteCharAt(builder.lastIndexOf(",")).toString();
    }
}
