package coding;

class Stack {

    int max = 5;
    int[] a = new int[max];
    int top;
    Stack() {
        top = -1;
    }

    boolean isEmpty() {
        return top < 0;
    }

    boolean push(int element) {

        if(top >= max - 1) {
            System.out.println("Stack overflow");
            return false;
        } else {
            a[++top] = element;
            System.out.println("Element pushed to stack");
            return true;
        }

    }

    int pop() {
        if(top < 0) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            return a[top--];
        }
    }

    int peek() {
        if(top < 0) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            return a[top];
        }
    }
}

public class StackImplementationUsingArrays {

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();


        System.out.println(stack.isEmpty());
    }
}
