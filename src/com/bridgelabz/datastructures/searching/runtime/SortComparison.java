package com.bridgelabz.datastructures.searching.runtime;

import java.util.Arrays;
import java.util.Random;

public class SortComparison {
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) arr[i] = rand.nextInt();
        return arr;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = t;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void mergeSort(int[] arr) {
        Arrays.sort(arr); // use Java's dual-pivot quicksort or implement your own merge sort
    }

    public static void main(String[] args) {
        int[] arr1 = generateRandomArray(1000);
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        int[] arr3 = Arrays.copyOf(arr1, arr1.length);

        long start = System.nanoTime();
        bubbleSort(arr1);
        long end = System.nanoTime();
        System.out.println("Bubble Sort: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        mergeSort(arr2);
        end = System.nanoTime();
        System.out.println("Merge Sort: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        Arrays.sort(arr3); // Java's quicksort
        end = System.nanoTime();
        System.out.println("Quick Sort (Java): " + (end - start) / 1_000_000.0 + " ms");
    }
}

