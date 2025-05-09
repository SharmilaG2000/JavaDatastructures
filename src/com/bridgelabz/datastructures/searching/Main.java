package com.bridgelabz.datastructures.searching;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Linear Search Problem 1: First Negative Number ===");
        int[] arr1 = {3, 5, -2, 7, 8};
        int indexNeg = LinearSearchFirstNegative.findFirstNegative(arr1);
        System.out.println("First negative number is at index: " + indexNeg);  // Expected: 2

        System.out.println("\n=== Linear Search Problem 2: Word in Sentences ===");
        String[] sentences = {
            "This is a test sentence.",
            "We are learning Java.",
            "Linear search is simple."
        };
        String word = "Java";
        String resultSentence = LinearSearchWordInSentences.findSentenceWithWord(sentences, word);
        System.out.println("Sentence with word '" + word + "': " + resultSentence);  // Expected: "We are learning Java."

        System.out.println("\n=== Binary Search Problem 1: Rotation Point ===");
        int[] rotatedArr = {15, 18, 2, 3, 6, 12};
        int rotationIndex = BinarySearchRotationPoint.findRotationPoint(rotatedArr);
        System.out.println("Rotation point index: " + rotationIndex);  // Expected: 2

        System.out.println("\n=== Binary Search Problem 2: Peak Element ===");
        int[] peakArr = {1, 3, 20, 4, 1};
        int peak = BinarySearchPeak.findPeak(peakArr);
        System.out.println("A peak element is: " + peak);  // Output: 20 or another valid peak

        System.out.println("\n=== Binary Search Problem 3: Search in 2D Matrix ===");
        int[][] matrix = {
            {1, 3, 5},
            {7, 9, 11},
            {13, 15, 17}
        };
        int target = 9;
        boolean found = BinarySearch2DMatrix.searchMatrix(matrix, target);
        System.out.println("Is " + target + " found? " + found);  // Expected: true

        System.out.println("\n=== Binary Search Problem 4: First and Last Occurrence ===");
        int[] sortedArr = {2, 4, 4, 4, 6, 8};
        int[] result = BinarySearchFirstLast.findFirstLast(sortedArr, 4);
        System.out.println("First index: " + result[0] + ", Last index: " + result[1]);  // Expected: 1, 3

        System.out.println("\n=== Challenge Problem: First Missing Positive ===");
        int[] nums = {3, 4, -1, 1};
        int missing = LinearSearchFirstMissingPositive.findFirstMissingPositive(nums);
        System.out.println("First missing positive number: " + missing);  // Expected: 2

        System.out.println("\n=== Challenge Problem: Target Index Using Binary Search ===");
        int[] numsForSearch = {5, 1, 4, 2, 3};
        int targetValue = 3;
        int targetIndex = BinarySearchTargetIndex.findTargetIndex(numsForSearch, targetValue);
        System.out.println("Index of " + targetValue + ": " + targetIndex);  // Expected: index of 3 in sorted array
    }
}
