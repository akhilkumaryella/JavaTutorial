package coding;

//https://leetcode.com/problems/middle-of-the-linked-list/
public class MiddleOfLinkedList {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode middle = middleNode(head);
        ListNode.printElements(middle);
        head.next.next.next.next.next = new ListNode(6);
        ListNode.printElements(middleNode(head));
    }

    public static ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
