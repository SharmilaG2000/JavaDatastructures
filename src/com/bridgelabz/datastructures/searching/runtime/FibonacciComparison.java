package com.bridgelabz.datastructures.searching.runtime;

public class FibonacciComparison {
    public static int fibRecursive(int n) {
        if (n <= 1) return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    public static int fibIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 30;

        long start = System.nanoTime();
        fibRecursive(n);
        long end = System.nanoTime();
        System.out.println("Recursive: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        fibIterative(n);
        end = System.nanoTime();
        System.out.println("Iterative: " + (end - start) / 1_000_000.0 + " ms");
    }
}

