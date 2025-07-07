package com.javapractice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q30 {

	public static void main(String[] args) {
		
//		/Merge Two Lists into a Single List
		
		List<Integer> list1 = List.of(1, 2, 3);
		List<Integer> list2 = List.of(4, 5, 6);
		
		List<Integer>mergedList = Stream.concat(list1.stream(), list2.stream())
									.collect(Collectors.toList());
		
		System.out.println(mergedList);
					
	}
}
