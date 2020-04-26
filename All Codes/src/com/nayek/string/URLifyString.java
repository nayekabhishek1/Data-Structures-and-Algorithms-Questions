package com.nayek.string;

public class URLifyString {

	public void urlify(String str) {

		String newStr = str.trim();
		System.out.println(newStr.replaceAll("[^a-zA-Z-0-9]", "%20"));
	}

	public static void main(String[] args) {
		String str1 = "Mr John Smith  ";
		String str2 = "Mr Benedict Cumberbatch ";
		String str3 = "Mr James Bond 007  ";

		URLifyString us = new URLifyString();
		us.urlify(str1);
		us.urlify(str2);
		us.urlify(str3);
	}
}
