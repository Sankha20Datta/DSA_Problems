package com.java8Practice;

public class Question12 {

	public static void main(String[] args) {
		
		
		//Given a string, count the number of vowels. solve this one
		
		String input ="Sankha subhra Datta";
		
		long vowelCOunt = input.toLowerCase()
							.chars()
							.filter(ch -> "aeiou".indexOf(ch)>=0)
							//.filter(ch -> "aeiou".indexOf(ch)>= 0)
							.count();
		
		System.out.println(vowelCOunt);
	}
}
