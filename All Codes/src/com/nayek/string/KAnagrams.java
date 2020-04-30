package com.nayek.string;

import java.util.Arrays;

public class KAnagrams {

	public boolean findKAnagrams(String str1, String str2, int k) {
		char[] ch1 = str1.toLowerCase().toCharArray();
		char[] ch2 = str2.toLowerCase().toCharArray();
		Arrays.parallelSort(ch1);
		Arrays.parallelSort(ch2);

		int count = 0;
		int i = 0;
		int j = 0;
		while (i < ch1.length && j < ch2.length) {
			if (ch1[i] != ch2[j]) {
				count++;
			}
			i++;
			j++;
		}

		while (i < ch1.length) {
			count++;
		}
		while (j < ch2.length) {
			count++;
		}

		System.out.println("places to be changed :" + count);
		if (count == k) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {

		KAnagrams ka = new KAnagrams();

		String str1 = "fodr";
		String str2 = "gork";
		int k = 2;

		String str3 = "April";
		String str4 = "PrBme";
		int k1 = 2;

		System.out.println(ka.findKAnagrams(str1, str2, k));
		System.out.println(ka.findKAnagrams(str3, str4, k1));

	}

}
