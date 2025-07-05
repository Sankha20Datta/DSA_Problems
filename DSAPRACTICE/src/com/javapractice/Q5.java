package com.javapractice;

import java.util.List;

public class Q5 {

	public static void main(String[] args) {
		//. Find the Minimum Element in a List
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		
		int min = numbers.stream().min(Integer::compare).orElse(0);
		
		System.out.println(min);
	}
}
