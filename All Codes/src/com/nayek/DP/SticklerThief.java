package com.nayek.DP;

public class SticklerThief {

	public int findLoot(int[] arr) {
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);

		for (int i = 2; i < arr.length; i++) {
			// this means if we are including current element then we wont include previous
			// element
			// and if we are including previous element then current element will be skipped
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
		}

		return dp[dp.length - 1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SticklerThief st = new SticklerThief();
		int[] arr1 = { 5, 5, 10, 100, 10, 5 };
		int[] arr2 = { 1, 2, 3 };
		int[] arr3 = { 6, 7, 1, 3, 8, 2, 4 };
		int[] arr4 = { 5, 3, 4, 11, 2 };

		System.out.println(st.findLoot(arr1));
		System.out.println(st.findLoot(arr2));
		System.out.println(st.findLoot(arr3));
		System.out.println(st.findLoot(arr4));
	}

}
