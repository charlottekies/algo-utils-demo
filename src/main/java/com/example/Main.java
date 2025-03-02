package com.example;

import com.charlottekies.algoutils.sorting.comparison.inplace.BubbleSorter;
import com.charlottekies.algoutils.sorting.comparison.inplace.SelectionSorter;

public class Main {
    public static void main(String[] args) {
        // Example 1: Sorting an array of integers
        int[] intArray = {5, 2, 8, 1, 3};
        SelectionSorter sorter = new SelectionSorter();

        System.out.println("Unsorted int array:  ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println("");
        int[] sortedIntArray = sorter.sort(intArray);
        System.out.println("Sorted int array using a Selection Sort algorithm: ");
        for (int num : sortedIntArray) {
            System.out.print(num + " ");
        }

        System.out.println("\n");


        String[] stringArray = {"banana", "apple", "cherry", "date"};
        System.out.println("Unsorted String array:  ");
        for (String num : stringArray) {
            System.out.print(num + " ");
        }
        System.out.println("");

        String[] sortedStringArray = sorter.sort(stringArray);
        System.out.println("Sorted string array using a Selection Sort algorithm: ");
        for (String str : sortedStringArray) {
            System.out.print(str + " ");
        }

        System.out.println("\n");

        Integer[] integerArray = {9, 4, 7, 1, 6};

        System.out.println("Unsorted Integer array:  ");
        for (Integer num : integerArray) {
            System.out.print(num + " ");
        }
        System.out.println("");
        Integer[] sortedIntegerArray = sorter.sort(integerArray);
        System.out.println("Sorted Integer array using a Selection Sort algorithm:: ");
        for (Integer num : sortedIntegerArray) {
            System.out.print(num + " ");
        }
    }
}
