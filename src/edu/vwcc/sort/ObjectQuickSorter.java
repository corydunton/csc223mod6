package edu.vwcc.sort;

/**
 * The ObjectQuickSorter class provides a public static method for performing a
 * quick sort on an array of Comparable objects.
 */

public class ObjectQuickSorter {

	public static <T extends Comparable<T>> void sort(T[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	private static <T extends Comparable<T>> void quickSort(T[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	private static <T extends Comparable<T>> int partition(T[] arr, int low, int high) {
		T pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j].compareTo(pivot) <= 0) {
				i++;
				T temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		T temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return i + 1;
	}
}
