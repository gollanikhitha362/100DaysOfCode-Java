package com.dataStructures;

public class StackExample {

	public static void main(String[] args) {
		MyStack m = new MyStack(10);
		m.push(10);
		m.push(20);
		m.push(30);
		m.display();
		m.pop();
		m.peek();
		m.display();
	}

}
class MyStack{
	private int[] stack;
	private int top;
	private int capacity;
	
	public MyStack(int capacity){
		stack = new int[capacity];
		top = -1;
		this.capacity=capacity;
	}
	//Algorithms
	//1.push elements to top of the stack
	public void push(int element) {
		if (top==capacity-1) {
			System.out.println("stack overflow");
		}
		stack[++top]=element;
		System.out.println("element inserted..."+element);
	}
	//2.pop element from the stack
	public int pop() {
		if(isEmpty()==true) {
			System.out.println("stack underflow");
			return -1;
		}
		int element=stack[top--];
		return element;
	}
	//3.peek
	public int peek() {
		if(top==-1) {
			System.out.println("stack is empty");
			return -1;
		}
		return stack[top];
	}
	//4.isEmpty
	public boolean isEmpty() {
		return top==-1;
	}
	public void display() {
		if(top == -1) {
			System.out.println("Stack is Empty");
			return;
		}
		System.out.println("Stack: ");
		for(int i=0; i<=top; i++) {
			System.out.print(stack[i]+" ");
		}
		System.out.println();
	}
}
