package com.ArrayPractice;

import java.util.Arrays;

//4. Check if an array contains a specific element
public class Problem4 {

	public static void main(String[] args) {
		
		
		int arr[] = {1,4,5,2,6,7,8};
		
		int element = 6;
		
		System.out.println("The index of the element is  "+ findElementInArray(arr,element));
		
		boolean exists = Arrays.stream(arr).anyMatch(e->e==element);
		
		System.out.println(exists?"The element is present in Array":"Not Present");

	}

	private static int findElementInArray(int[] arr, int element) {
	
		int start = 0;
		
		int end = arr.length-1;
		
		while(start<=end) {
			if(arr[start]==element) return start;
			if(arr[end]==element) return end;
		
			start++; end--;
			
		}
		
		
		return -1;
	}

}
