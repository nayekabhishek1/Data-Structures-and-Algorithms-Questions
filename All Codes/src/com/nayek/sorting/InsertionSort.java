package com.nayek.sorting;

public class InsertionSort {

	private void printArray(int[] arr) {

		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}

	public void insert(int[] arr) {
		for (int i = 1; i < arr.length; i++) {

			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		printArray(arr);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort ar = new InsertionSort();
		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		ar.printArray(arr);
		ar.insert(arr);

	}

}
