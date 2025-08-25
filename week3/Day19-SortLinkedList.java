import com.dataStructure;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        next = null;
    }
}
public class SortLinkedListSimple {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode mid = getMiddle(head);
        ListNode right = mid.next;
        mid.next = null; // cut the list
      
        ListNode left = sortList(head);
        right = sortList(right);
      
        return merge(left, right);
    }
    private ListNode getMiddle(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if (l1 != null) temp.next = l1;
        if (l2 != null) temp.next = l2;

        return dummy.next;
    }
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortLinkedListSimple list = new SortLinkedListSimple();
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        System.out.print("Original List: ");
        list.printList(head);

        head = list.sortList(head);

        System.out.print("Sorted List: ");
        list.printList(head);
    }
}
