package com.techpalle;

class Node{
	int val;
	Node next;
	
	Node(int val){
		this.val=val;
		this.next=null;
	}
}

public class InsertAtNthPos {
	Node head;
	
	//insert at Nth position
	public void insertAtPos(int val, int pos) {
		Node newNode = new Node(val);
		
		if(pos==1) {
			newNode.next=head;
			head=newNode;
			return;
		}
		Node temp=head;
		for(int i=1; i<pos-1 && temp!=null; i++) {
			temp=temp.next;
		}
		if(temp==null) {
			System.out.println("Position out of range!");
			return;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	public void display() {
		Node current = head;
		while(current!=null) {
			System.out.print(current.val+" -> ");
			current=current.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		InsertAtNthPos list = new InsertAtNthPos();
		list.insertAtPos(10, 1);
		list.insertAtPos(20, 2);
		list.insertAtPos(15, 2);
		list.insertAtPos(5, 1);
		
		list.display();
	}

}
