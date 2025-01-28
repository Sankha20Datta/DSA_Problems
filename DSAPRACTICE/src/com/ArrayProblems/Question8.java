package com.ArrayProblems;

public class Question8 {
//	Given a sorted array Arr[](0-index based) consisting of N distinct integers and an integer k, the task is to find the index of k, if its present in the array Arr[]. Otherwise
// find the index where k must be inserted to keep the array sorted.
	
	public static void main(String[] args) {
		
		int arr[]= {1, 3, 5, 6};
		int k=4;
		int index=getInedex(arr,k);
		System.out.println(index);
	}

private static int getInedex(int[] arr, int k) {
	int left=0;
	int right = arr.length-1;
	
	// run the loop while left did not cross the right
	
	while(left<=right) {
		
		int mid= left+(right-left)/2;
		if(arr[mid]==k)return mid;
		
		if(arr[mid]<k) {
			left=mid+1;
		}else {
			right=mid-1;
		}
	}
	
	//as all the small elements less than k has to be at left and when left crosses the right 
	// at that position only you need the to insert the element to maintain the order
	return left;
	
}
}
