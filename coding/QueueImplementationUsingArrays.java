package coding;

import java.util.Arrays;

public class QueueImplementationUsingArrays {


    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(6);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        queue.push(7);
        queue.push(8);
        queue.push(9);
        queue.push(10);
    }
}

class Queue {

    int[] queue = new int[5];

    int pushIndex = 0;
    int popIndex = 0;
    int queueSize = 0;


    public void push(int x) {

        if(queueSize < queue.length) {

            if(pushIndex >= queue.length) {
                queue[pushIndex++ % queue.length] = x;
            } else {
                queue[pushIndex++] = x;
            }
            queueSize++;
        } else {
            System.out.println("Queue is full");
        }
        System.out.println("--- ----- -----");
        Arrays.stream(queue).forEach(System.out::println);
        System.out.println("--- ----- -----");
    }

    public int pop() {

        if(queueSize != 0) {
            queueSize--;
            return queue[popIndex++];
        } else {
            System.out.println("Queue is Empty");
        }

        return  -1;
    }
}
