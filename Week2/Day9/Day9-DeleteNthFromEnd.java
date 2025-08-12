package com.techpalle;

class ListNode{
	int val;
	ListNode next;
	public ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}
public class DeleteNthFromEnd {
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode fast = head;
		ListNode slow = head;
		
		for(int i=0; i<n; i++) {
			fast = fast.next;
		}
		if(fast == null) {
			return head.next;
		}

		while(fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return head;
	}
	
	public static void printList(ListNode head) {
		ListNode temp = head;
		while(temp != null) {
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ListNode head = new ListNode(10);
		head.next = new ListNode(20);
		head.next.next = new ListNode(30);
		head.next.next.next = new ListNode(40);
		head.next.next.next.next = new ListNode(50);
		
		System.out.print("Original list: ");
		printList(head);
		
		head = removeNthFromEnd(head, 2);
		System.out.print("After deletion: ");
		printList(head);

	}

}
