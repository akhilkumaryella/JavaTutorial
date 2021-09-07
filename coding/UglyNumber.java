package coding;

/**
 * https://leetcode.com/problems/ugly-number/
 * ugly number is a number whose prime factors limited to 2, 3, 5
 * 6 -> 2 * 3 - true
 * 8 -> 2 * 2 * 2 - true
 * 14 -> 2 * 7 - false
 */
public class UglyNumber {

    public static void main(String[] args) {
        System.out.println(isUgly(100));
        System.out.println(isUgly(214));
    }

    public static boolean isUgly(int n) {

        if(n == 1) return true;

        if(n == 0) return false;

        int[] primes = new int[]{2, 3, 5};

        int i = 0;
        while(i < 3) {
            while(n % primes[i] == 0) {
                n /= primes[i];
            }
            i++;
        }

        return n == 1;
    }
}
