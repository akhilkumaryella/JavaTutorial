package coding;

/**
 * https://leetcode.com/problems/linked-list-cycle/
 * https://www.geeksforgeeks.org/detect-loop-in-a-linked-list/
 */
public class LinkedListLoop {

    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }

        return false;
    }
}
