package com.java8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question2 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList(
			    "apple",
			    "banana",
			    "apple",
			    "orange",
			    "banana",
			    "apple",
			    "mango",
			    "banana",
			    "grapes",
			    "mango"
			);
		
		Map<String,Long>wordsFrequency = words.stream().sorted().collect(Collectors.groupingBy(word->word,Collectors.counting()));
		
		
		System.out.println(wordsFrequency);
	}
}
