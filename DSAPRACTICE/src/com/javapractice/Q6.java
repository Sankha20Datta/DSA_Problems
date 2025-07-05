package com.javapractice;

import java.util.List;

public class Q6 {

	
	public static void main(String[] args) {
		//Count the Number of Elements in a List
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5,6,7);

		
		long countOfElements = numbers.stream().count();
		
		System.out.println(countOfElements);
	}
}
