package com.javapractice;

import java.util.List;

public class Q2 {

	public static void main(String[] args) {
		//2. Find the Product of All Elements in a List
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		
		int product = numbers.stream().reduce(1,(a,b)->  a*b);
		
		System.out.println(product);
	}
}
