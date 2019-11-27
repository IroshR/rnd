package com.iroshnk.java.recursion;

public class Fibonacci {
    public static int fibonacci(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Invalid argument for Fibonacci series: " + number);
        } else if (number == 0) {
            return 0;
        } else if (number == 1 || number == 2) {
            return 1;
        }

        return fibonacci(number - 2) + fibonacci(number - 1);
    }

    public static void main(String[] args) {
        for (int n = 0; n <= 20; n++) {
            System.out.println("N is " + n + " -> fibonacci : " + fibonacci(n));
        }
    }
}
