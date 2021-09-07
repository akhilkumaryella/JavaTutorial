package coding;

/**
 * https://leetcode.com/problems/reverse-integer/
 */
public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    public static int reverse(int x) {

        long out = 0;

        while(x != 0) {
            out = (out * 10)  + x % 10;
            x = x / 10;
        }

        return out > Integer.MAX_VALUE || out < Integer.MIN_VALUE ? 0 : (int) out;
    }
}
