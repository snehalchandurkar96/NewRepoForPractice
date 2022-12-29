package com.demo;

import java.util.HashMap;

public class StringCountWords {

	public static void main(String[] args) {
		String str = "Java is a a Prgramming language";

		String[] s = str.split(" ");
		HashMap<String, Integer> hm = new HashMap<>();
		for (String st : s) {
			if (hm.get(st) == null) {
				hm.put(st, 1);

			} else {

				hm.put(st, hm.get(st) + 1);
			}
		}
		System.out.println(hm);
	}

}
