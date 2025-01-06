package com.ArrayProblems;

public class Question2 {

//	Given an integer array arr[]. You need to find the maximum sum of a subarray.
//
//	Examples:
//
//	Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
//	Output: 11
//	Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.
	public static void main(String[] args) {
		int arr[] = {2, 3, -8, 7, -1, 2, 3};
		System.out.println(largestSum(arr));
	}
	// here we have to use kadane's Algorithm
		private static int largestSum(int[] arr) {
		     int result = arr[0]; 
		        int currSum =arr[0];
		        for(int i=1;i<arr.length;i++){
		            /*
		            to understand that the currsum added to the element is greater
		            than the particular element or not if not change the subarray  
		            and currsum
		            */
		           currSum = Math.max(currSum+arr[i],arr[i]);
		           
		           //then find the maximum
		           result = Math.max(currSum,result);
		        }
		        return result;
		}
}
