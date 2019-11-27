package com.iroshnk.java.recursion;

public class Factorial {
    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Invalid argument for Fibonacci series: " + number);
        } else if (number == 0) {
            return 1;
        }

        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        for (int n = 0; n <= 20; n++) {
            System.out.println("N is " + n + " -> factorial : " + factorial(n));
        }
    }
}
