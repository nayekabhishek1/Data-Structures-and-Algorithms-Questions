package com.nayek.string;

public class ImplementStrStr {

	public int find(String s, String x) {

		return s.indexOf(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImplementStrStr is = new ImplementStrStr();
		String s1 = "GeeksForGeeks";
		String x1 = "Fr";

		String s2 = "GeeksForGeeks";
		String x2 = "For";

		System.out.println(is.find(s1, x1));
		System.out.println(is.find(s2, x2));

	}

}
