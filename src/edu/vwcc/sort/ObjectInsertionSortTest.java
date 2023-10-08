package edu.vwcc.sort;

/**
 * This program tests the insertionSort method in the ObjectInstertionSorter
 * class.
 */

public class ObjectInsertionSortTest {

	public static void main(String[] args) {
		String[] arr = { "banana", "apple", "cherry", "date", "fig" };

		System.out.println("Original Array:");
		printArray(arr);

		ObjectInsertionSorter.sort(arr);

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
