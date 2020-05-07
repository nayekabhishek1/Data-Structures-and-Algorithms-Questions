package com.nayek.DP;

public class MinNumberJumps {

	public int findMinJumps(int[] arr) {
		int jumpCount = 0;
		int i = 0;
		while (i < arr.length - 1) {
			int n = arr[i];
			if (n != 0) {
				i = i + n;
				jumpCount++;
			} else {
				return Integer.MAX_VALUE;
			}
		}

		return jumpCount;
	}

	public static void main(String[] args) {
		MinNumberJumps mj = new MinNumberJumps();
		int[] arr1 = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
		int[] arr2 = { 1, 0, 3, 2, 6, 7 };
		int[] arr3 = { 4, 2, 1, 9, 6, 5 };
		int[] arr4 = { 1, 3, 6, 1, 0, 9 }; 
		System.out.println(mj.findMinJumps(arr1));
		System.out.println(mj.findMinJumps(arr2));
		System.out.println(mj.findMinJumps(arr3));
		System.out.println(mj.findMinJumps(arr4));

	}

}
