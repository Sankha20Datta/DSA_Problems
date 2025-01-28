package com.ArrayProblems;

public class Question10 {

	
	public static void main(String[] args) {
		int arr[]= {1,2,3};
		System.out.println(getMajorityIndex(arr));
	}

	private static int getMajorityIndex(int[] arr) {
		
		
	    int n=arr.length-1;
        int rightElement=arr[arr.length-1];
        
        for(int i=n-1;i>=0;i--){
        	System.out.println(rightElement);
            if(arr[i]>rightElement && arr[i]>arr[i-1]) {
            	System.out.println("Hii");
            	return i;
            	}
            rightElement=arr[i];
        }
        
        return -1;
		

	}
}
