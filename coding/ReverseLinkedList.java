package coding;

/**
 * https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode reverse = reverseList(head);
        ListNode.printElements(reverse);
    }

    public static ListNode reverseList(ListNode head) {

        ListNode newHead = null;

        while(head != null) {

            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }

        return newHead;
    }
}


