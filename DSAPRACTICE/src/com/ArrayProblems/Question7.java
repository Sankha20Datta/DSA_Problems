package com.ArrayProblems;

public class Question7 {

	
//	Given a sorted array arr[] (with unique elements) and an integer k, find the index (0-based) of the largest element in arr[] that is less than or equal to k. This element 
//	is called the "floor" of k. If such an element does not exist, return -1.
	public static void main(String[] args) {
		
		int arr []= {1, 2, 8, 10, 11, 12, 19};
		int k=0;
		
		int floorElement = getFloor(arr,k);
		System.out.println("The index is -->"+floorElement);
		//System.out.println("The Element is -->"+arr[floorElement]);
	}

private static int getFloor(int[] arr, int k) {

	int left=0;
	int right=arr.length-1;
	int result=-1;
	
	while(left<=right) {
		
		int mid = left+(right-left)/2;
		if(arr[mid]==k)return mid;
		
		if(arr[mid]<k) {
			result=mid;
			left=mid+1;
		}else {
			right=mid-1;
		}
	}
	
	return result;
}
}
