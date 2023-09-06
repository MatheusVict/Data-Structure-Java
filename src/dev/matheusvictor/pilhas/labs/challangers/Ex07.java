package dev.matheusvictor.pilhas.labs.challangers;

import java.util.Stack;

public class Ex07 {
    public static void main(String[] args) {
        printResult(6);
        printResult(2500);
        printResult(1369);
        printResult(1);

        printAnyBase(50523, 9);

        printAnyBase(113, 16);
        printAnyBase(113, 2);
    }

    public static void printResult(int number) {
        System.out.println(number + " in binary " + decimalToBinary(number));
    }
    public static void printAnyBase(int number, int base) {
        System.out.println(number + "in base " + decimalToAnyBase(number, base));
    }

    public static String decimalToBinary(int number) {

        Stack<Integer> stack = new Stack<>();
        StringBuilder numberBinary = new StringBuilder();
        int rest;

        while (number > 0) {
            rest = number % 2;
            stack.push(rest);
            number /= 2;
        }

        while (!stack.isEmpty()) {
            numberBinary.append(stack.pop());
        }

        return numberBinary.toString();
    }

    public static String decimalToAnyBase(int number, int base) {

        Stack<Integer> stack = new Stack<>();
        StringBuilder baseNumber = new StringBuilder();
        int rest;
        String bases = "0123456789ABCDEF";

        while (number > 0) {
            rest = number % base;
            stack.push(rest);
            number /= base;
        }

        while (!stack.isEmpty()) {
            baseNumber.append(bases.charAt(stack.pop()));
        }

        return baseNumber.toString();
    }
}
