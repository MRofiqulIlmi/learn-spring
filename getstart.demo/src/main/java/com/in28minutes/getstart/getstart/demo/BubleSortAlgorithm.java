package com.in28minutes.getstart.getstart.demo;

import org.springframework.stereotype.Component;

@Component
public class BubleSortAlgorithm implements SortAlgorithm{
    public int[] sort(int[] numbers) {
    	
    	System.out.println("called in bubble");
    	
        int n = numbers.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // Last i elements are already sorted, so reduce comparison
            for (int j = 0; j < n - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) { // Swap if the element is greater
                    swap(numbers, j, j + 1);
                    swapped = true;
                }
            }
            
            // If no elements were swapped, the array is already sorted
            if (!swapped) break;
        }
        return numbers;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
