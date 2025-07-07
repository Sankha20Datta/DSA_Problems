package com.javapractice;

public class Q40 {

	//Reverse a String Using Streams
	
	public static void main(String[] args) {
		
		
		String input ="hello";
		
		String reverse = input.chars()
							.mapToObj(e->String.valueOf(  (char)e))
							.reduce("",(a,b)->b+a);
							
		
		System.out.println(reverse);
	}
}
