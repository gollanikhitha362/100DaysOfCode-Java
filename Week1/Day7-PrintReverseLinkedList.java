package com.techpalle;

class Node2{
	int val;
	Node2 next;
	
	Node2(int val){
		this.val=val;
		this.next=null;
	}
}

public class PrintReverseLinkedList {
	Node2 head;
	
	//insert at end
	public void inserEnd(int val) {
		Node2 newNode = new Node2(val);
		if(head==null) {
			head=newNode;
			return;
		}
		Node2 temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next=newNode;
	}
	
	//printing linkedlist in reverse using recursion
	public void printReverse(Node2 node) {
		if(node == null) {
			return;
		}
		printReverse(node.next);
		System.out.print(node.val+" -> ");
	}
	
	public static void main(String[] args) {
		PrintReverseLinkedList list = new PrintReverseLinkedList();
		list.inserEnd(10);
		list.inserEnd(20);
		list.inserEnd(30);
		list.inserEnd(40);
		list.inserEnd(50);
		
		System.out.println("LinkedList in Reverse:");
		list.printReverse(list.head);
		System.out.println("null");
	}
}
