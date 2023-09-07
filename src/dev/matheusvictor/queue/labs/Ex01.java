package dev.matheusvictor.queue.labs;

import dev.matheusvictor.queue.Fila;

public class Ex01 {

    public static void main(String[] args) {
        Fila<File> fileFila = new Fila<>();

        fileFila.enfileirar(new File("A", 1));
        fileFila.enfileirar(new File("B", 3));
        fileFila.enfileirar(new File("C", 8));
        fileFila.enfileirar(new File("D", 2));
        fileFila.enfileirar(new File("E", 30));
        fileFila.enfileirar(new File("F", 14));

        while (!fileFila.isEmpty()) {
            File file = fileFila.pop();

            System.out.println("Printing file: " + file.getName());
            try {
                Thread.sleep(200L * file.getPages());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("All file printeds");
    }
}
