package com.bridgelabz.datastructures.searching.runtime;

public class StringConcatComparison {
    public static void main(String[] args) {
        int N = 10_000;

        long start = System.nanoTime();
        String result = "";
        for (int i = 0; i < N; i++) {
            result += "a";
        }
        long end = System.nanoTime();
        System.out.println("String (+): " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append("a");
        }
        end = System.nanoTime();
        System.out.println("StringBuilder: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sf.append("a");
        }
        end = System.nanoTime();
        System.out.println("StringBuffer: " + (end - start) / 1_000_000.0 + " ms");
    }
}

