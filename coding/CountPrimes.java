package coding;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/count-primes/
 */
public class CountPrimes {

    public static void main(String[] args) {

        System.out.println(countPrimeUsingArray(10));
    }

    public int countPrimes(int n) {

        if(n < 3) {
            return 0;
        }

        if(n == 3) {
            return 1;
        }

        int c = 2;
        for(int i = 5; i < n; i = i+2) {

            if(i % 2 != 0 && i % 3 != 0 && checkPrime(i)) {
                c++;
            }

        }

        return c;
    }

    public boolean checkPrime(int n) {

        for(int i = 5; i*i <= n; i=i+6) {
            if(n % i ==0 || n % (i+2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static int countPrimeUsingArray(int n) {

        if(n < 3) return 0;

        if(n == 3) return 1;

        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);
        primes[0]= false;
        primes[1] = false;

        for(int i = 2; i * i <= n; i++) {
            if(primes[i]) {
                for(int j = 2 * i; j < n; j = j + i) {
                    primes[j] = false;
                }
            }
        }

        int c = 0;
        for(int k = 2; k < primes.length; k++) {
            if(primes[k]) c++;
        }
        

        return c;
    }
}
