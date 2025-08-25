class StackNode {
    int data;
    StackNode next;
    StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyStack {
    StackNode top;

    // Push operation
    void push(int x) {
        StackNode newNode = new StackNode(x);
        newNode.next = top;
        top = newNode;
    }

    // Pop operation
    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    // Peek operation
    int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // Display
    void display() {
        StackNode temp = top;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class StackLinkedListDemo {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Popped: " + stack.pop());
        System.out.println("Top Element: " + stack.peek());
        stack.display();
    }
}
