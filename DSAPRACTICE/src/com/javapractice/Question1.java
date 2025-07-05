package com.javapractice;

import java.util.List;

public class Question1 {

	public static void main(String[] args) {
		//1. Find the Sum of All Elements in a List
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);

		// Here 0 is the initial value and add the sums
		//int sum = numbers.stream().reduce(0,(a,b)->  a+b);
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		
		// using paraller Stream
		
		int sum1 = numbers.parallelStream().reduce(0, Integer::sum);
		
		System.out.println(sum);
		System.out.println(sum1);
	}
}
