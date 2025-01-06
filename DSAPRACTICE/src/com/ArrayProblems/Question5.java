package com.ArrayProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Question5 {

//	
//	You are given an array arr of positive integers. Your task is to find all the leaders in the array. An element is considered a leader if it is greater than or equal to all elements to its right. The rightmost element is always a leader.
//
//	Examples:
//
//	Input: arr = [16, 17, 4, 3, 5, 2]
//	Output: [17, 5, 2]
//	Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2.
	
	public static void main(String[] args) {
		
		
		int arr[] = {16, 17, 4, 3, 5, 2};
		
		System.out.println(getArraYLeaders(arr));
	}

	private static List<Integer> getArraYLeaders(int[] arr) {
		
		List<Integer>list = new ArrayList<Integer>();
		
		// always remember the last element will always be a leader
		
		int n=arr.length-1;
		
		int leader = arr[n];
		
		list.add(leader);
		
		
		for(int i=n-1;i>=0;i--) {
			int theElement= arr[i];
			if(theElement>leader) {
				leader=theElement;
				list.add(leader);
			}
		}
		
		Collections.reverse(list);
		return list;
	}
}
