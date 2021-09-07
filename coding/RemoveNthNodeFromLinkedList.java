package coding;

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class RemoveNthNodeFromLinkedList {

    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head;
        ListNode slow = head;

        for(int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        if(fast == null) return slow.next;

        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;

    }
}
