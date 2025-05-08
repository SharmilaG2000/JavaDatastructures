package com.bridgelabz.datastructures;

public class MergeSort {
    public static void sort(int[] prices, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(prices, left, mid);
            sort(prices, mid + 1, right);
            merge(prices, left, mid, right);
        }
    }

    private static void merge(int[] prices, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(prices, left, L, 0, n1);
        System.arraycopy(prices, mid + 1, R, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            prices[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        }

        while (i < n1) prices[k++] = L[i++];
        while (j < n2) prices[k++] = R[j++];
    }
}

