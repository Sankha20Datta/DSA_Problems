package com.ArrayProblems;
//Given a positive integer n, find the square root of n. If n is not a perfect square, then return the floor value.
//
//Floor value of any number is the greatest Integer which is less than or equal to that number
public class Quetion9 {

	
	public static void main(String[] args) {
		int n=17;
		int squreroot = getsqrRoot(n);
		System.out.println(squreroot);
	}

	private static int getsqrRoot(int n) {

		if(n==0||n==1)return n;
		
		int left=1;
		int right=n;
		int result=0;
		
		while(left<=right) {
			int mid = left+(right-left)/2;
			
			if(mid*mid==n)return mid;
			
			if(mid*mid<n) {
				result=mid;
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		
		return result;
		
	}
}
