package com.ArrayProblems;

public class Question3 {
//	Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.
//
//			Note: The second largest element should not be equal to the largest element.
//
//			Examples:
//
//			Input: arr[] = [12, 35, 1, 10, 34, 1]
//			Output: 34
//			Explanation: The largest element of the array is 35 and the second largest element is 34.
	
	public static void main(String[] args) {
		
		
		int arr[]= {12, 35, 1, 10, 34, 1};
		
		System.out.println(secondLargest(arr));
	}

	private static int secondLargest(int[] arr) {
		
		int largest = arr[0];
		
		int secnd = -1;
		
		for(int i=1;i<arr.length;i++) {
			// first check the element is not same and greater than the largest 
			if(arr[i]!=largest && arr[i]>largest ) {
				secnd = largest;
				largest = arr[i];
			}
			// now check if the element is not same as second and greater than the second element or not
			else if(arr[i]!=secnd && arr[i]>secnd) {
				secnd=arr[i];
			}
		}
		
		return secnd;
	}
}
