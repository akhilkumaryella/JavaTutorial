package coding;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/copy-list-with-random-pointer/
 * https://www.youtube.com/watch?v=VNf6VynfpdM&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=40&ab_channel=takeUforward
 */
public class CopyListwithRandomPointer {

    public static void main(String[] args) {

        Node head = new Node(7);
        head.next = new Node(13);
        head.next.next = new Node(11);
        head.next.next.next = new Node(10);
        head.next.next.next.next = new Node(1);


        copyRandomList(head);
    }
    public static Node copyRandomList(Node head) {

        Map<Node, Node> map = new HashMap<>();

        Node temp = head;

        while(temp != null) {

            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        temp = head;

        while(temp != null) {
            map.get(temp).next = map.get(temp.next);
            map.get(temp).random = map.get(temp.random);
            Node.printElements(map.get(temp));
            temp = temp.next;
        }

        return map.get(head);
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    public static void printElements(Node head) {

        System.out.print("{ ");
        while(head != null) {
            System.out.print(head.val +" ");
            head  = head.next;
        }
        System.out.print("}");
    }
}
