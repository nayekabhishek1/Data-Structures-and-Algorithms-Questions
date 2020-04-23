package com.nayek.sorting;

public class SortBinaryArray {

	void printArray(int[] arr) {

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public void sortArray(int[] arr) {
		int count = 0;
		int length = arr.length;
		// for loop to get the count of number of 1s
		for (int i : arr) {
			if (i == 1) {
				count++;
			}
		}

		// for loop to reset the array to all zeros
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}

		int countOf1 = count;
		int tempIndex = 1;

		// while loop to set all the 1s at the end
		while (countOf1 > 0) {
			arr[length - tempIndex] = 1;
			countOf1--;
			tempIndex++;
		}

		// for loop to set all the zeros at remaining places starting from beginning
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				break;
			} else {
				arr[i] = 0;
			}
		}

		printArray(arr);
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 1, 1, 1, 0, 0, 0 };
		SortBinaryArray ar = new SortBinaryArray();
		ar.printArray(arr);
		System.out.println("");
		ar.sortArray(arr);
	}

}
