package com.nayek.string;

public class TitleCaseCoversion {

	public void convert(String str) {
		if (str == null || str.isEmpty()) {
			return;
		}

		char[] ch = str.toCharArray();
		

		ch[0] = Character.toUpperCase(str.charAt(0));
		for (int i = 1; i < str.length(); i++) {
			if (Character.isWhitespace(str.charAt(i))) {
				ch[i + 1] = Character.toUpperCase(str.charAt(i + 1));
			}
		}

		for (char c : ch) {
			System.out.print(c);
		}
	}

	public static void main(String[] args) {
		TitleCaseCoversion tc = new TitleCaseCoversion();
		String str = "my name is abhishek";
		tc.convert(str);
	}
}
