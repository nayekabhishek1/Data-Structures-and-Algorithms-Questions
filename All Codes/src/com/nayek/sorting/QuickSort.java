package com.nayek.sorting;


//Algorithm
/* low  --> Starting index,  high  --> Ending index */
/*quickSort(arr[], low, high)
{
    if (low < high)
    {
         pi is partitioning index, arr[pi] is now
           at right place 
        pi = partition(arr, low, high);

        quickSort(arr, low, pi - 1);  // Before pi
        quickSort(arr, pi + 1, high); // After pi
    }
}*/

public class QuickSort {

	public int partition(int[] arr, int low, int high) {
		int pivot = high;
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] < arr[pivot]) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	public void sort(int[] arr, int low, int high) {
		if (low < high) {
			int partitionIndex = partition(arr, low, high);

			sort(arr, low, partitionIndex - 1);
			sort(arr, partitionIndex + 1, high);
		}

	}

	private void printArray(int[] arr) {

		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		int[] arr = { 10, 9, 8, 7, 6, 4, 3, 2, 1 };
		qs.printArray(arr);
		qs.sort(arr, 0, arr.length-1);

		System.out.println("After Sorting");
		qs.printArray(arr);

	}

}
