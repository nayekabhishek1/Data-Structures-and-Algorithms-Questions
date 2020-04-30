package com.nayek.string;

public class CheckSubsequence {

	public int findSubsequence(String a, String b) {
		char[] arr = a.toCharArray();
		char[] brr = b.toCharArray();

		int j = 0;
		int countA = 0;
		for (int i = 0; i < arr.length; i++) {
			while (j < brr.length) {
				if (arr[i] == brr[j]) {
					j++;
					countA++;
					break;
				}
				j++;
			}
		}

		if (countA == arr.length) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		CheckSubsequence cs = new CheckSubsequence();

		String x1 = "BAT";
		String x2 = "BATMAN";

		String a1 = "AXY";
		String b1 = "YADXCP";

		String a2 = "gksrek";
		String b2 = "geeksforgeeks";

		System.out.println(cs.findSubsequence(x1, x2));
		System.out.println(cs.findSubsequence(a1, b1));
		System.out.println(cs.findSubsequence(a2, b2));

	}

}
