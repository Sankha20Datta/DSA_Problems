package com.javapractice;

import java.util.List;

public class Q24 {

	public static void main(String[] args) {
		
		
		//Find the Second-Smallest Element in a List
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		
		int secndSmallest = numbers.stream().sorted().skip(1).findFirst().orElse(0);
		
		System.out.println(secndSmallest);
	}
}
