package com.ArrayProblems;

public class Question4 {

//	You are given an array arr[] of non-negative numbers. Each number tells you the maximum number of steps you can jump forward from that position.
//
//	For example:
//
//	If arr[i] = 3, you can jump 1 step, 2 steps, or 3 steps forward from position i.
//	If arr[i] = 0, you cannot jump forward from that position.
//	Your task is to find the minimum number of jumps needed to move from the first position in the array to the last position.
//
//	Note:  Return -1 if you can't reach the end of the array.
//
//	Examples : 
//
//	Input: arr[] = [1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9]
//	Output: 3 
//	Explanation: First jump from 1st element to 2nd element with value 3. From here we jump to 5th element with value 9, and from here we will jump to the last.


	public static void main(String[] args) {
		
		int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		
		
		System.out.println(findNumberofJumps(arr));
	}

	private static int findNumberofJumps(int[] arr) {

		int n =arr.length;
		
		if(n==0) return 0;
		if(arr[0]==0) return -1;
		
		
		int jumps=0; // to calculate number of jumps
		int jumpedElement =0;  // to get the jumped Element
		int curr=0;  // to check the current element
		
		
		
		for(int i=0;i<arr.length;i++) {
			jumpedElement = Math.max(jumpedElement, i+arr[i]);
			if(i==curr) {
				jumps++;
				curr=jumpedElement; // upgrade the next postion to jumpedElement
				if(jumpedElement>=n-1) {
					return jumps; // jumped Element cross the length of the array then return jumps.
				}
			}
			if(curr<=i) {
				return -1;
			}
			
		}
		
		return -1;
	}
}
