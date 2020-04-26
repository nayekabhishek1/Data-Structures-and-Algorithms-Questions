package com.nayek.string;

public class MergeStrings {

	public void merge(String str1, String str2) {
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		int n1 = ch1.length;
		int n2 = ch2.length;
		int finalLength = n1 + n2;
		char[] finArr = new char[finalLength];

		int i = 0;
		int j = 0;
		int k = 0;
		while (k < finArr.length) {
			if (i < ch1.length) {
				finArr[k++] = ch1[i++];
			}
			if (j < ch2.length) {
				finArr[k++] = ch2[j++];
			}
		}

		for (int x = 0; x < finArr.length; x++) {
			System.out.print(finArr[x] + " ");
		}
	}

	public static void main(String[] args) {

		MergeStrings ms = new MergeStrings();
		String str1 = "abhishek";
		String str2 = "nayek";

		ms.merge(str1, str2);

	}

}
