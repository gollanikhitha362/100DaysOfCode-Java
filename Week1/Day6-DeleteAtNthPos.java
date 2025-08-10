package com.techpalle;

class Node1 {
    int val;
    Node1 next;

    Node1(int val) {
        this.val = val;
        this.next = null;
    }
}

public class DeleteAtNthPos {
	 Node1 head;

	    // Insert at end 
	    public void insertEnd(int val) {
	        Node1 newNode = new Node1(val);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node1 temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = newNode;
	    }

	    // Delete node at Nth position
	    public void deleteAtPosition(int position) {
	        if (head == null) {
	            System.out.println("List is empty!");
	            return;
	        }

	        // If deleting head
	        if (position == 1) {
	            head = head.next;
	            return;
	        }

	        Node1 temp = head;
	        for (int i = 1; i < position - 1 && temp != null; i++) {
	            temp = temp.next;
	        }

	        // If position is invalid
	        if (temp == null || temp.next == null) {
	            System.out.println("Position out of range!");
	            return;
	        }

	        temp.next = temp.next.next;
	    }

	    // Display list
	    public void display() {
	        Node1 current = head;
	        while (current != null) {
	            System.out.print(current.val + " -> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }

	public static void main(String[] args) {

		DeleteAtNthPos list = new DeleteAtNthPos();
		        
		        // Add elements
		        list.insertEnd(10);
		        list.insertEnd(20);
		        list.insertEnd(30);
		        list.insertEnd(40);
		        list.insertEnd(50);

		        System.out.println("Original list:");
		        list.display();

		        list.deleteAtPosition(3); // Deletes 30
		        System.out.println("After deleting at position 3:");
		        list.display();

		        list.deleteAtPosition(1); // Deletes 10
		        System.out.println("After deleting at position 1:");
		        list.display();
	}
}
