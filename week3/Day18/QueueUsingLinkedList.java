class QueueNode {
    int data;
    QueueNode next;
    QueueNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyQueue {
    QueueNode front, rear;

    // Enqueue operation
    void enqueue(int x) {
        QueueNode newNode = new QueueNode(x);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue operation
    int dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int dequeued = front.data;
        front = front.next;
        if (front == null) rear = null;
        return dequeued;
    }

    // Peek operation
    int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    // Display
    void display() {
        QueueNode temp = front;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class QueueLinkedListDemo {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front Element: " + queue.peek());
        queue.display();
    }
}
