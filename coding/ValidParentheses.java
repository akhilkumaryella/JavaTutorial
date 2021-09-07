package coding;
import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParentheses {

    public static void main(String[] args) {

        System.out.println(isValid("(){}[]"));

        System.out.println(isValid("(){}]"));
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    return false;
                } else {
                    if(c == ')' && stack.peek() != '(') {
                        return false;
                    } else if(c == '}' && stack.peek() != '{') {
                        return false;
                    } else if(c == ']' && stack.peek() != '[') {
                        return false;
                    }

                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }
}