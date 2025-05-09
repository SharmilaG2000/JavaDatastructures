package com.bridgelabz.datastructures.searching;

public class BinarySearchFirstLast {
    public static int[] findFirstLast(int[] arr, int target) {
        int first = findIndex(arr, target, true);
        int last = findIndex(arr, target, false);
        return new int[]{first, last};
    }

    private static int findIndex(int[] arr, int target, boolean first) {
        int res = -1;
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                res = mid;
                if (first) right = mid - 1;
                else left = mid + 1;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return res;
    }
}
