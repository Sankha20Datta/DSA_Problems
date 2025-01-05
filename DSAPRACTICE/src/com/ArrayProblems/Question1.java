package com.ArrayProblems;

public class Question1 {

	
//	Given an array arr[] where no two adjacent elements are same, 
//	find the index of a peak element. An element is considered to be
//	a peak if it is greater than its adjacent elements (if they exist).
//	If there are multiple peak elements, return index of any one of them.
//	The output will be "true" if the index returned by your function 
//	is correct; otherwise, it will be "false".
//
//	Note: Consider the element before the first element and the element
//	after the last element to be negative infinity.
//
//	Examples :
//
//	Input: arr = [1, 2, 4, 5, 7, 8, 3]
//	Output: true
//	Explanation: arr[5] = 8 is a peak element because arr[4] < arr[5] > arr[6].
	
	
	public static void main(String[] args) {
		int arr[]= {1, 2, 4, 5, 7, 8, 3};
		System.out.println(peakElement(arr));
	}

	   public static int peakElement(int[] arr) {
		   
		   int i=0;
		   
		   int j = arr.length-1;
		   // run a loop until i is less than j
		   while(i<j) {
			   if(arr[j]>arr[j-1]) { // as at any point of time we get an element who is greater than its  next element return the element
				
				   return j;
			   }
			   j--;
		   }
		   
		 
		return 0;
	   	}
}
