package com.bridgelabz.datastructures.searching;

public class BinarySearchPeak {
    public static int findPeak(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            boolean leftOk = mid == 0 || arr[mid] > arr[mid - 1];
            boolean rightOk = mid == arr.length - 1 || arr[mid] > arr[mid + 1];

            if (leftOk && rightOk) return arr[mid];
            if (mid > 0 && arr[mid - 1] > arr[mid]) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }
}

