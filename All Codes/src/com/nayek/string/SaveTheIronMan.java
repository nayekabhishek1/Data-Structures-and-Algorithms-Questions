package com.nayek.string;

public class SaveTheIronMan {

	public boolean isAlphanumericPalindrome(String str) {
		String newStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		System.out.println(newStr);
		char[] ch = newStr.toCharArray();

		int firstPtr = 0;
		int lastPtr = ch.length - 1;
		while (firstPtr < lastPtr) {
			if (ch[firstPtr] != ch[lastPtr]) {
				return false;
			} else {
				firstPtr++;
				lastPtr--;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String str1 = "I am :IronnorI Ma, i";
		String str2 = "Ab?/Ba";

		SaveTheIronMan sm = new SaveTheIronMan();
		System.out.println(sm.isAlphanumericPalindrome(str1));
		System.out.println(sm.isAlphanumericPalindrome(str2));

	}

}
