package dev.matheusvictor.pilhas.labs.challangers;

import java.util.Stack;

public class Ex08 {

    public static void main(String[] args) {
        Stack<Integer> original = new Stack<>();
        Stack<Integer> destiny = new Stack<>();
        Stack<Integer> auxiliary = new Stack<>();

        original.push(4);
        original.push(3);
        original.push(2);
        original.push(1);
        
        hanoiTown(original.size(), original, destiny, auxiliary);
    }

    public static void hanoiTown(
            int disks, Stack<Integer> original,
            Stack<Integer> destiny,
            Stack<Integer> auxiliary
    ) {
        if (disks > 0) {
            hanoiTown(disks -1, original, auxiliary, destiny);
            destiny.push(original.pop());
            System.out.println("------");
            System.out.println("Original stack " + original);
            System.out.println("auxiliary stack " + auxiliary);
            System.out.println("destiny stack " + destiny);
            hanoiTown(disks - 1, auxiliary, destiny, original);
        }
    }
}
