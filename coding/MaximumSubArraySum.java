package coding;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution : kadane's Algorithm
 * https://leetcode.com/problems/maximum-subarray/
 */
public class MaximumSubArraySum {

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        getArrays(nums);

        System.out.println(maxSubArraySum(nums));
    }

    // o(n)
    public static int maxSubArraySum(int[] nums) {

        int sum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i < nums.length; i++) {

            if(sum > 0) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }

            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }

    /**
     * o(n^3)
     */
    public static void getArrays(int[] nums) {

        int n = nums.length;

        List<List<Integer>>  out = new ArrayList<>();

        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                List<Integer> temp = new ArrayList<>();
                for(int k = i; k <= j; k++) {
                    temp.add(nums[k]);
                }
                if(!temp.isEmpty()) {
                    out.add(temp);
                }
            }
        }

        System.out.println(out);

    }
}
