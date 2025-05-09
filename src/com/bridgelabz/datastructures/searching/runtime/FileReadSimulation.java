package com.bridgelabz.datastructures.searching.runtime;

public class FileReadSimulation {
    public static void main(String[] args) {
        long start = System.nanoTime();
        // Simulate FileReader reading
        try { Thread.sleep(10); } catch (Exception ignored) {}
        long end = System.nanoTime();
        System.out.println("FileReader simulated: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        // Simulate InputStreamReader reading
        try { Thread.sleep(5); } catch (Exception ignored) {}
        end = System.nanoTime();
        System.out.println("InputStreamReader simulated: " + (end - start) / 1_000_000.0 + " ms");
    }
}

