package com.ArrayProblems;

public class Question11 {

//	Given an array of integers arr[], the task is to find the first equilibrium point in the array.
//	The equilibrium point in an array is an index (0-based indexing) such that
//	the sum of all elements before that index is the
//	same as the sum of elements after it. Return -1 if no such point exists. 
	public static void main(String[] args) {
		
		int arr[]= {-7, 1, 5, 2, -4, 3, 0};
		
		System.out.println(getEqulibriumIndex(arr));
	}

		private static int getEqulibriumIndex(int[] arr) {
		
			int totalSum=0;
			int leftSum=0;
			
			for(int i=0;i<arr.length;i++) {
				totalSum+=arr[i];
			}
			
			for(int i=0;i<arr.length;i++) {
				int rightSum = totalSum-leftSum-arr[i];
				if(rightSum==leftSum) {
					return i;
				}
				
				leftSum+=arr[i];
			}
			
			return -1	;
		}
}
