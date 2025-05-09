package com.bridgelabz.datastructures.searching;

import java.util.Arrays;

public class BinarySearchTargetIndex {
    public static int findTargetIndex(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }
}
