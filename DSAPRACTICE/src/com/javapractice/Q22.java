package com.javapractice;

import java.util.stream.IntStream;

public class Q22 {
	
	public static void main(String[] args) {
		
		//Find the Factorial of a Number
		
		int number = 5;
		
		int product = IntStream.rangeClosed(1, number)
						.boxed().reduce(1, (a,b)->a*b);
		
		System.out.println(product);
	}

}
