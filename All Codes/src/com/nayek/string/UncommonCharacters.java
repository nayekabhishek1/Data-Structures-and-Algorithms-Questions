package com.nayek.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UncommonCharacters {

	public void findUncommon(String str1, String str2) {
		Set<Character> set1 = new HashSet<>();
		Set<Character> set2 = new HashSet<>();

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		for (char c : ch1) {
			set1.add(c);
		}
		for (char c : ch2) {
			set2.add(c);
		}

		Map<Character, Integer> map = new HashMap<>();

		for (char c : set1) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (char c : set2) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (@SuppressWarnings("rawtypes")
		Map.Entry entry : map.entrySet()) {

			if (entry.getValue().equals(1))

			{
				System.out.print(entry.getKey() + " ");
			}
		}

	}

	public static void main(String[] args) {

		UncommonCharacters uc = new UncommonCharacters();

		String str1 = "characters";
		String str2 = "alphabets";
		uc.findUncommon(str1, str2);

	}

}
