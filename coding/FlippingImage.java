package coding;

/**
 * https://leetcode.com/problems/flipping-an-image/
 */
public class FlippingImage {

    public static void main(String[] args) {

    }

    public int[][] flipAndInvertImage(int[][] A) {

        for(int i = 0; i < A.length; i++) {
            int low = 0;
            int high = A.length - 1;
            while(low <= high) {
                if(A[i][low] == A[i][high]) {
                    A[i][low] = 1 - A[i][low];
                    A[i][high] = A[i][low];
                }
                low++;
                high--;
            }
        }

        return A;
    }
}
