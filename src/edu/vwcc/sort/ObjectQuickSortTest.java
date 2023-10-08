package edu.vwcc.sort;

/**
 * This program tests the quickSort method in the ObjectQuickSorter class.
 */

public class ObjectQuickSortTest {

	public static void main(String[] args) {
		String[] arr = { "banana", "apple", "cherry", "date", "fig" };

		System.out.println("Original Array:");
		printArray(arr);

		ObjectQuickSorter.sort(arr);

		System.out.println("\nSorted Array:");
		printArray(arr);
	}

	public static void printArray(Object[] arr) {
		for (Object element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
