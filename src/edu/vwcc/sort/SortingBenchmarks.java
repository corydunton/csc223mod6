package edu.vwcc.sort;

import java.util.Arrays;

public class SortingBenchmarks {

	public static void main(String[] args) {
		int[] arr1 = { 39, 9, 83, 47, 7, 65, 86, 95, 8, 39, 75, 38, 13, 97, 33, 95, 52, 21, 12, 13 };
		int[] arr2 = { 39, 9, 83, 47, 7, 65, 86, 95, 8, 39, 75, 38, 13, 97, 33, 95, 52, 21, 12, 13 };
		int[] arr3 = { 39, 9, 83, 47, 7, 65, 86, 95, 8, 39, 75, 38, 13, 97, 33, 95, 52, 21, 12, 13 };
		int[] arr4 = { 39, 9, 83, 47, 7, 65, 86, 95, 8, 39, 75, 38, 13, 97, 33, 95, 52, 21, 12, 13 };

		IntInsertionSorter.resetSwapCount();
		IntBubbleSorter.resetSwapCount();
		IntSelectionSorter.resetSwapCount();
		IntQuickSorter.resetSwapCount();

		IntInsertionSorter.insertionSort(arr1);
		int insertionSwaps = IntInsertionSorter.getSwapCount();
		System.out.println("Insertion Sort Swaps: " + insertionSwaps);

		IntBubbleSorter.bubbleSort(arr2);
		int bubbleSwaps = IntBubbleSorter.getSwapCount();
		System.out.println("Bubble Sort Swaps: " + bubbleSwaps);

		IntSelectionSorter.selectionSort(arr3);
		int selectionSwaps = IntSelectionSorter.getSwapCount();
		System.out.println("Selection Sort Swaps: " + selectionSwaps);

		IntQuickSorter.quickSort(arr4);
		int quickSwaps = IntQuickSorter.getSwapCount();
		System.out.println("Quick Sort Swaps: " + quickSwaps);

		// Verify that all methods produced the same sorted array
		boolean areEqual = Arrays.equals(arr1, arr2) && Arrays.equals(arr1, arr3) && Arrays.equals(arr1, arr4);
		System.out.println("Arrays are equal: " + areEqual);
	}
}
