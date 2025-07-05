package com.javapractice;

import java.util.List;
import java.util.stream.Collectors;

public class Q16 {

	public static void main(String[] args) {
		//Remove Duplicate Elements from a List
		List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5);
		
		List<Integer>unique = numbers.stream().distinct().collect(Collectors.toList());
		
		System.out.println(unique);
	}
}
