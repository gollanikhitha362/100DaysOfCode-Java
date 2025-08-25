package com.dataStructures;

class Node{
	int val;
	Node next;
	public Node(int val) {
		this.val=val;
		this.next=null;
	}
}

class SingleLinkedList {
	private Node root;
	public SingleLinkedList(){
		this.root=null;
	}
	public void addNewNode(int val) {
		Node n = new Node(val);
		if(this.root==null) {
			this.root=n;
			return;
		}
		Node temp=this.root;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=n;
	}
	public void Display() {
		if(this.root==null) {
			return;
		}
		Node temp = root;
		while(temp!=null) {
			System.out.println(temp.val+"->");
			temp=temp.next;
		}
		System.out.println("null");
		
	}
}

class LinkedList{
    public static void main(String[] args) {
    	SingleLinkedList s = new SingleLinkedList();
    	s.addNewNode(10);
    	s.addNewNode(20);
   		s.addNewNode(30);
   		s.Display();
    }
}

