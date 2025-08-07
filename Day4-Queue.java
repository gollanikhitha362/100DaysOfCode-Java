package com.dataStructures;

public class QueueExample {
	int[] queue;
	int front;
	int rear;
	int capacity;
	private int element;
	
	public QueueExample(int capacity) {
		queue = new int[capacity];
		this.capacity = capacity;
		front=0;
		rear=0;
	}

	public void enqueue(int val) {
		if(isFull()==true) {
			System.out.println("Queue is full, try again");
			return;
		}
		queue[rear++] = val;
		System.out.println("Successfully inserted");
	}
	
	public int dequeue() {
		if(isEmpty()==true) {
			System.out.println("queue is empty, try later");
			return -1;
		}
		int val = this.queue[front++];
		System.out.println("removed successfully "+ val);
		return val;
	}

	public int size() {
		return rear-front;
	}
	
	public boolean isFull() {
		if(rear==capacity) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private boolean isEmpty() {
		if(front==rear) {
			return true;
		}
		return false;
	}
	
	public int peek() {
		if(isEmpty()==true) {
			System.out.println("queue is empty");
			return -1;
		}
		return queue[front];
	}
	
	public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
	
	public static void main(String[] args) {
		int val;
		QueueExample q = new QueueExample(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.display();
		q.dequeue();
		q.display();
		System.out.println("peek: "+q.peek());
		System.out.println("size: "+q.size());
		
	}
 
}
