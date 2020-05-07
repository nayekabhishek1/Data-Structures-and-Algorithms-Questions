package com.nayek.DP;

public class KadaneAlgorithm {

	public int findMax(int[] arr) {

		int maxTillNow = 0;
		int currMax = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			maxTillNow = maxTillNow + arr[i];

			if (maxTillNow > currMax) {
				currMax = maxTillNow;
			}
		}
		return currMax;
	}

	public static void main(String[] args) {

		KadaneAlgorithm ka = new KadaneAlgorithm();
		int[] arr1 = { 1, 2, 3, -2, 5 };
		int[] arr2 = { -1, -2, -3, -4 };

		System.out.println(ka.findMax(arr1));
		System.out.println(ka.findMax(arr2));

	}

}
