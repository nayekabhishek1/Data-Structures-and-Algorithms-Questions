package com.nayek.sorting;

public class Sort012Array {

	public void sortArray(int[] arr) {
		int count1 = 0;
		int count2 = 0;
		int length = arr.length;
		// for loop to get the count of number of 1s
		for (int i : arr) {
			if (i == 1) {
				count1++;
			}
		}

		// for loop to get the count of number of 2s
		for (int i : arr) {
			if (i == 2) {
				count2++;
			}
		}

		// for loop to reset the array to all zeros
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}

		int tempIndex = 1;

		// while loop to set all the 2s at the end
		while (count2 > 0) {
			arr[length - tempIndex] = 2;
			count2--;
			tempIndex++;
		}

		// for loop to set all the 1s
		for (int i = arr.length - 1; count1 != 0;) {
			if (arr[i] == 2) {
				i--;
			} else {
				arr[i] = 1;
				i--;
				count1--;
			}
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

	private void printArray(int[] arr) {

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	public static void main(String[] args) {
		Sort012Array ar = new Sort012Array();

		int[] arr = { 0, 0, 2, 2, 1, 1, 2, 2, 1, 1, 2, 0, 0, 0, 1 };
		ar.printArray(arr);
		System.out.println("");
		ar.sortArray(arr);

	}

}
