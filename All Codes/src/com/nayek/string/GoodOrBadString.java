package com.nayek.string;

public class GoodOrBadString {

	public int isGoodOrBad(String str) {

		int vowCount = 0;
		int conCount = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowCount++;
			}

			else if (str.charAt(i) == '?') {
				vowCount++;
				conCount++;
			} else {
				conCount++;
			}
		}

		if (vowCount == 5 || conCount == 3) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		GoodOrBadString gbs = new GoodOrBadString();
		String str1 = "abhisheknp";
		String str2 = "bcdaeiou??";
		String str3 = "aeioup??";
		System.out.println(gbs.isGoodOrBad(str1));
		System.out.println(gbs.isGoodOrBad(str2));
		System.out.println(gbs.isGoodOrBad(str3));

	}

}
