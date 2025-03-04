package com.in28minutes.getstart.getstart.demo;

public class QuickSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers) {
    	System.out.println("called in quick");
        quickSort(numbers, 0, numbers.length - 1);
        return numbers;
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1); // Sort left part
            quickSort(arr, partitionIndex + 1, high); // Sort right part
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the last element as the pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) { // If current element is smaller than the pivot
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high); // Move pivot to correct position
        return i + 1; // Return pivot index
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
