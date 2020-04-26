package com.nayek.string;

import java.util.Arrays;

public class AnagramCheck {

	public boolean isAnagram(String str1, String str2) {
		if (str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty() || str1.length() != str2.length()) {
			return false;
		} else {

			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			Arrays.parallelSort(ch1);
			Arrays.parallelSort(ch2);

			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] != ch2[i]) {
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {

		AnagramCheck ac = new AnagramCheck();
		String str1 = "top";
		String str2 = "pot";
		System.out.println(ac.isAnagram(str1, str2));

	}

}
