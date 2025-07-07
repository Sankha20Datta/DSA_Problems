package com.javapractice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q32 {

	public static void main(String[] args) {
		//Find the Union of Two Lists
		
		List<Integer> list1 = List.of(1, 2, 3);
		List<Integer> list2 = List.of(3, 4, 5);
		
		List<Integer>unionList = Stream.concat(list1.stream(), list2.stream())
								.distinct()
								.collect(Collectors.toList());
		
		System.out.println(unionList);
	}
}
