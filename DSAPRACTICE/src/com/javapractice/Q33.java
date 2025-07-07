package com.javapractice;

import java.util.List;
import java.util.stream.Collectors;

public class Q33 {

	public static void main(String[] args) {
		// Find the Difference Between Two Lists
		
		List<Integer> list1 = List.of(1, 2, 3, 4);
		List<Integer> list2 = List.of(3, 4, 5, 6);
		List<Integer> difference = list1.stream()
		    .filter(n -> !list2.contains(n))
		    .collect(Collectors.toList());
		System.out.println("Difference: " + difference);
	}
}
