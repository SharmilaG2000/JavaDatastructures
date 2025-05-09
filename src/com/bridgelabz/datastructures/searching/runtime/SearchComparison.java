package com.bridgelabz.datastructures.searching.runtime;

import java.util.Arrays;

public class SearchComparison {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = new int[1_000_000];
        for (int i = 0; i < data.length; i++) data[i] = i;

        int target = 999_999;

        long start = System.nanoTime();
        linearSearch(data, target);
        long end = System.nanoTime();
        System.out.println("Linear Search Time: " + (end - start) / 1_000_000.0 + " ms");

        Arrays.sort(data); // already sorted, but needed for binary search

        start = System.nanoTime();
        binarySearch(data, target);
        end = System.nanoTime();
        System.out.println("Binary Search Time: " + (end - start) / 1_000_000.0 + " ms");
    }
}

