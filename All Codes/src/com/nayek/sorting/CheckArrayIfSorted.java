package com.nayek.sorting;

public class CheckArrayIfSorted {

	public boolean checkSortedArray(int[] arr) {

		if (arr == null) {
			return false;
		}
		else if (arr.length == 1) {
			return true;
		}

		else {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {

		int[] arr1 = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int[] arr2 = { 10, 20, 40, 30, 70, 60, 80 };

		CheckArrayIfSorted ar = new CheckArrayIfSorted();
		System.out.println(ar.checkSortedArray(arr1));
		System.out.println(ar.checkSortedArray(arr2));

	}

}
