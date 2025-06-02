package com.LinkedListPractice;

public class Question1 {

	public static void main(String[] args) {
		
		Node head = Node.getNode();
		
	
		
		int midNodeData = getMidNodeData(head);
		
		System.out.println("midNodeData ---> "+midNodeData);
		
		midNodeData = getMidNodeDataWithNaiveSolution(head);
		
		System.out.println(midNodeData);

	}

	private static int getMidNodeDataWithNaiveSolution(Node head) {
		
		int length=0;
		Node curr = head;
		while(curr!=null) {
			length++;
			curr=curr.next;
		}
		
		int midLength = length/2;
		curr = head;
		while(midLength>0) {
			curr=curr.next;
			midLength--;
		}
		
		return curr.data;
	}

	//Tortoise and Hare Algorithm - O(n) time and O(1) space
	private static int getMidNodeData(Node head) {
		Node slow = head;
		Node fast = head;
		
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		
		
		return slow.data;
	}

}
