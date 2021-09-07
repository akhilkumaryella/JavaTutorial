package coding;

/**
 * https://www.geeksforgeeks.org/check-if-two-arrays-are-equal-or-not/
 */
public class TwoArraysEquals {

    public static void main(String[] args) {

        System.out.println(arraysEquals(new int[]{ 3, 5, 2, 5, 2 }, new int[]{ 2, 3, 5, 5, 2 }));
        System.out.println(arraysEquals(new int[]{ 3, 5, 1, 5, 2 }, new int[]{ 2, 3, 5, 5, 2 }));
    }

    public static boolean arraysEquals(int[] a1, int[] a2) {

        int m = a1.length;
        int n = a2.length;

        if(m != n) return false;

        int aXOR = a1[0];
        for(int i = 1; i < a1.length; i++) {
            aXOR ^= a1[i];
        }

        int bXOR = a2[0];
        for(int i = 1; i < a2.length; i++) {
            bXOR ^= a2[i];
        }

        return (aXOR ^ bXOR) == 0;
    }
}
