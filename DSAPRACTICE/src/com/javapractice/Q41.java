package com.javapractice;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q41 {
	
		//Find the Most Frequent Element in a List
		public static void main(String[] args) {
			
			List<String> words = List.of("apple", "banana", "banana", "apple");

			
		Map<String, Long> map = words.stream()
				.collect(Collectors.groupingBy(c->c,Collectors.counting()));
		String mostFrequent =	map
			.entrySet()
			.stream()
			.max(Map.Entry.comparingByValue())
			.map(Map.Entry::getKey)
			.orElse(null);
		
		long maxCount = map.values().stream()
						.max(Long::compareTo)
						.orElse(0L);
		
		System.out.println(mostFrequent);
		System.out.println(maxCount);
		
		String most = map.entrySet().stream()
					.filter(e->e.getValue()==maxCount)
					.map(Map.Entry::getKey)
					.sorted(Comparator.comparingInt(String::length).reversed())
					.findFirst()
					.orElse(null);
			
		System.out.println(most);
		System.out.print(words.stream()
			.collect(Collectors.groupingBy(c->c,Collectors.counting())));
		}
}
