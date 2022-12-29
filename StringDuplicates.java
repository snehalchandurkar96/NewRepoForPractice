package com.demo;

public class StringDuplicates {

	public static void main(String[] args) {
		String str = "ababc";
		String dup = "";
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			
			if(dup.indexOf(ch)==-1) {
				dup=dup+ch;
			}

		}
		System.out.println("Remove Duplicates = " + dup);

	}

}
