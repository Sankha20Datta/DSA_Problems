package com.javapractice;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Q44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		/Find the First Repeated Character in a String
		
		String input = "sankhasubhra";
		
		Character charName = input.chars()
		.mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(c->c,Collectors.counting()))
		.entrySet().stream()
		.filter(e->e.getValue()>1)
		.map(Map.Entry::getKey)
		.findFirst()
		.orElse(null);
		
       // String input = "sankhasubhra";

        Set<Character> seen = new HashSet<>();

        Character firstRepeated = input.chars()
            .mapToObj(c -> (char) c)
            .filter(c -> !seen.add(c)) // only allows duplicates to pass
            .findFirst()
            .orElse(null);

        System.out.println("First Repeated Character: " + firstRepeated);
		
		System.out.println(charName);
	}

}
