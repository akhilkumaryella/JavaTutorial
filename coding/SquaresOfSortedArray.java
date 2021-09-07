package coding;

/**
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public class SquaresOfSortedArray {

    public static void main(String[] args) {

        int[] input = {-7,-5,-3,-1,0,2,4,6,8};
        int[] output = sortedSquares(input);
        for (int i : output) {
            System.out.print(i +" ");
        }
    }

    public static int[] sortedSquares(int[] nums) {

        int n = nums.length - 1;

        int i = 0;
        int j = n;

        int[] out = new int[n + 1];
        while(i <= j) {

            if(nums[i] * nums[i] >= nums[j] * nums[j]) {
                out[n--] = nums[i] * nums[i];
                i++;

            } else if(nums[i] * nums[i] < nums[j] * nums[j]) {
                out[n--] = nums[j] * nums[j];
                j--;
            }
        }

        return out;
    }


}
