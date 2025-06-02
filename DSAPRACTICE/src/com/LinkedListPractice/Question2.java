package com.LinkedListPractice;


/*
 * 
 * 
 * Given a singly linked list. The task is to remove duplicates (nodes with duplicate values) from the given list (if it exists).
Note: Try not to use extra space. The nodes are arranged in a sorted way.
 * 
 * 
 * */
public class Question2 {

	public static void main(String[] args) {
		
		
		Node head = Node.getNode();
		
		head = removeDuplicates(head);
		
		Node curr = head;
		
		while(curr!=null) {
			System.out.print(curr.data+"-->");
			curr=curr.next;
		}
		System.out.println("Null");
	}

	private static Node removeDuplicates(Node head) {
		
		if(head==null || head.next==null) return head;
		
		Node curr = head;
		
		while(curr!=null && curr.next!=null ) {
			
			if(curr.data==curr.next.data) {
				curr.next=curr.next.next;
			}else {
				curr=curr.next;
			}
		}
		
		return head;
	}
}
