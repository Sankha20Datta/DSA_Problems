package com.javapractice;

import java.util.List;

public class Q4 {

	public static void main(String[] args) {
		//Find the Maximum Element in a List
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		
		int max = numbers.stream().max(Integer::compare).orElse(0);
		
		System.out.println(max);
	}
}
