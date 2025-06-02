package com.LinkedListPractice;

public class Node {
	
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		
	}
	
	public static Node getNode() {
		Node head = new Node(1);
		
		Node node1 = new Node(2);
		Node node2 = new Node(2);
		Node node3 = new Node(4);
		Node node4 = new Node(5);
		Node node5 = new Node(5);
		
		head.next=node1;
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		
		return head;
		
	}

}
