package coding;

/**
 * https://leetcode.com/problems/powx-n/
 */
public class BinaryExponentiation {

    public static void main(String[] args) {

        BinaryExponentiation be = new BinaryExponentiation();
        System.out.println(be.myPowerec(2,10));
    }

    public double myPow(double x, int n) {

        double ans = 1;

        long temp = n < 0 ? -1 * (long) n : n;

        while(temp > 0) {

            if(temp % 2 == 0) {
                x = x * x;
                temp = temp / 2;
            } else {
                ans = ans * x;
                temp = temp - 1;
            }
        }

        return n < 0 ? 1 / ans : ans;
    }

    /**
     * using recursion
     * @param x
     * @param n
     * @return
     */
    public double myPowerec(double x, int n) {

        if (x == 0) {
            return 0;
        }
        if (n > 0) {
            return findPower(x, n);
        }
        else {
            return 1 / findPower(x, -1 * (long) n);
        }
    }
    private double findPower(double x, long n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return findPower(x*x, n/2);
        }
        return x * findPower(x, n-1);
    }
}


