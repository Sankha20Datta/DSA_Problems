package com.javapractice;

import java.util.List;
import java.util.stream.Collectors;

public class Q31 {
	
	public static void main(String[] args) {
		
		//Find the Intersection of Two Lists
		
		List<Integer> list1 = List.of(1, 2, 3, 4);
		List<Integer> list2 = List.of(3, 4, 5, 6);
		
		List<Integer>interSectlist = list1.stream().filter(list2::contains)
									.collect(Collectors.toList());
		
		System.err.println(interSectlist);
	}

}
