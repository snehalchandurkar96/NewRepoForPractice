package com.demo;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
	
	public static void main(String[] args) {
		
//		String firstWord="listen";
//		String secondWord="silent";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter firstWord ");
		String firstWord= sc.next();
		System.out.println("Enter secondWord ");
		String secondWord= sc.next();
		char[] ch1=firstWord.toCharArray();
		char[] ch2=secondWord.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean result=Arrays.equals(ch1, ch2);
		
		if(result==true) {
			System.out.println("Its an anagram");
		}
		else {
			System.out.println("It is not an anagram");
		}
		
		
	}

}
