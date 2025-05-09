package com.bridgelabz.datastructures.searching.runtime;

import java.util.*;

public class SearchStructureComparison {
    public static void main(String[] args) {
        int N = 1_000_000;
        int target = 999_999;

        int[] arr = new int[N];
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            arr[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        long start = System.nanoTime();
        for (int i : arr) {
            if (i == target) break;
        }
        long end = System.nanoTime();
        System.out.println("Array Search: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        hashSet.contains(target);
        end = System.nanoTime();
        System.out.println("HashSet Search: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        treeSet.contains(target);
        end = System.nanoTime();
        System.out.println("TreeSet Search: " + (end - start) / 1_000_000.0 + " ms");
    }
}

