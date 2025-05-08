package com.bridgelabz.datastructures;

public class CountingSort {
    public static void sort(int[] ages) {
        int max = 18, min = 10;
        int range = max - min + 1;
        int[] count = new int[range];

        for (int age : ages) {
            count[age - min]++;
        }

        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i]-- > 0) {
                ages[index++] = i + min;
            }
        }
    }
}
