package com.demo;

public class StringReverse {

	public static void main(String[] args) {
		String str = "Snehal";
		String reverse = "";
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			reverse = ch + reverse;// s+r=s---n+s=ns

		}
		System.out.println("Reverse String = " + reverse);
		System.out.println(str);

	}

}
