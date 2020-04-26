package com.nayek.string;

public class SortString {

	public void mergeSort(char[] ch, int l, int r) {
		if (l < r) {

			int mid = (l + r) / 2;
			mergeSort(ch, l, mid);
			mergeSort(ch, mid + 1, r);
			merge(ch, l, mid, r);
		}
	}

	private void merge(char[] ch, int l, int mid, int r) {

		int n1 = mid - l + 1;
		int n2 = r - mid;
		char[] temp1 = new char[n1];
		char[] temp2 = new char[n2];

		for (int i = 0; i < n1; i++) {
			temp1[i] = ch[l + i];
		}

		for (int j = 0; j < n2; j++) {
			temp2[j] = ch[mid + 1 + j];
		}

		int i = 0;
		int j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (temp1[i] <= temp2[j]) {
				ch[k++] = temp1[i++];

			}
			if (temp1[i] > temp2[j]) {
				ch[k++] = temp2[j++];

			}
		}

		while (i < n1) {
			ch[k++] = temp1[i++];
		}

		while (j < n2) {
			ch[k++] = temp2[j++];
		}

	}

	public static void main(String[] args) {

		SortString ss = new SortString();
		String str = "zyxwvutsrqponmlkjihgfedcba";

		char[] ch = str.toCharArray();
		int l = 0;
		int r = ch.length - 1;
		ss.mergeSort(ch, l, r);

		for (char c : ch) {
			System.out.print(c + " ");
		}

	}

}
