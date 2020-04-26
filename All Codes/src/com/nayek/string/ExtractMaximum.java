package com.nayek.string;

public class ExtractMaximum {

	public int extract(String str) {
		String temp = "";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				temp = "";
				continue;
			} else {
				temp = temp + str.charAt(i);
				// System.out.println(temp);

				if (Integer.parseInt(temp) > sum) {
					sum = Integer.parseInt(temp);
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		ExtractMaximum em = new ExtractMaximum();

		String str1 = "100klh564abc365bg";
		String str2 = "abvhd9sdnkjdfs";
		String str3 = "abchsd0sdhs";

		System.out.println(em.extract(str1));
		System.out.println(em.extract(str2));
		System.out.println(em.extract(str3));

	}

}
