package com.nayek.string;

public class PalindromeCheck {

	public boolean isPalindrome(String str) {

		if (str == null || str.isEmpty()) {
			return false;
		}

		char[] ch = str.toCharArray();
		int left = 0;
		int right = ch.length - 1;

		while (left < right) {
			if (ch[left] != ch[right]) {
				return false;
			} else {
				left++;
				right--;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		PalindromeCheck pc = new PalindromeCheck();
		String str = "abba";
		System.out.println(pc.isPalindrome(str));

	}

}
