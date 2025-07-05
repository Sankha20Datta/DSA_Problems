package com.javapractice;

import java.util.List;

public class Q3 {

	public static void main(String[] args) {
		
		// Average of Elements
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		
		
		double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
		
		System.out.println(average);
	}
}
