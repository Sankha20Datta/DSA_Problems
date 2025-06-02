package com.LinkedListPractice;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Node head = Node.getNode();
		
		System.out.println(isCyclePresent(head));
	}

	private static boolean isCyclePresent(Node head) {
	    Node slow = head;
        Node fast = head;
        
        while(slow!=null && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow==fast) return true;
        }
        
        return false;
	}

}
