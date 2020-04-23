package com.nayek.sorting;

public class SortTheHalfSorted {

	private void printArray(int[] arr) {

		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}

	public void sort(int[] arr) {

		int len = arr.length;
		int[] temp1 = new int[len / 2];
		int[] temp2 = new int[len / 2];

		for (int i = 0; i < len / 2; i++) {
			temp1[i] = arr[i];
		}

		int temp = 0;
		for (int i = len / 2; i < len; i++) {

			temp2[temp++] = arr[i];
		}

		int indexi = 0;
		int indexj = 0;
		int i = 0;
		while (indexi < temp1.length && indexj < temp2.length) {

			if (temp1[indexi] <= temp2[indexj]) {
				arr[i] = temp1[indexi];
				i++;
				indexi++;
			} else {
				arr[i] = temp2[indexj];
				i++;
				indexj++;
			}
		}

		while (indexi < temp1.length) {
			arr[i] = temp1[indexi];
			i++;
			indexi++;
		}
		while (indexj < temp2.length) {
			arr[i] = temp2[indexj];
			i++;
			indexj++;
		}
		printArray(arr);
	}

	public static void main(String[] args) {
		SortTheHalfSorted ob = new SortTheHalfSorted();
		int[] arr = { 5, 7, 8, 9, 1, 2, 3, 6 };
		ob.printArray(arr);
		ob.sort(arr);

	}

}
