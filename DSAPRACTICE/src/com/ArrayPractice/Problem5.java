package com.ArrayPractice;

import java.util.Arrays;

public class Problem5 {

	//Count occurrences of a given element
	public static void main(String[] args) {

		
		int arr[] = {4,6,4,1,2,4,13};
		
		int element = 4;
		
		System.out.println("The number of time "+element+" occured in the array is "+getCountInArray(arr,element));
		
		System.out.println("Find the number of type element is in Array "+ Arrays.stream(arr).filter(e->e==element).count() );
	}

	private static int getCountInArray(int[] arr, int element) {
		
		int count = 0;
	
		int i=0;
		int j=arr.length-1;
		
		while(i<=j) {
			if(arr[i]==element) count++;
			if(i==j) return count;
			if(arr[j]==element) count++;
			
			i++;
			
			j--;
		}
		
//	    while (i <= j) {
//	        if (arr[i] == element) count++;
//
//	        // Only count arr[j] if i and j are different
//	        if (i != j && arr[j] == element) count++;
//
//	        i++;
//	        j--;
//	    }
 	
	
		return count;
	}

}
