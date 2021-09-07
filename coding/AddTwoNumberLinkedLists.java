package coding;

/**
 * https://leetcode.com/problems/add-two-numbers/
 */
 class AddTwoNumberLinkedLists {

    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode out = new ListNode(0);
        int carry = 0;
        ListNode curr = out;
        while(l1 != null || l2 != null) {

            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            int sum = x + y + carry;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            carry = sum / 10;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        if(carry != 0) curr.next = new ListNode(carry);

        return out.next;
    }
}
