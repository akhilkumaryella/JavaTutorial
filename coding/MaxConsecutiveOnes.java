package coding;

/**
 * https://leetcode.com/problems/max-consecutive-ones/
 * https://www.youtube.com/watch?v=Mo33MjjMlyA&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=44&ab_channel=takeUforward
 */
public class MaxConsecutiveOnes {

    public static void main(String[] args) {

        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            int start = i;
            while(i < nums.length && nums[i] == 1) {
                i++;
            }
            max = Math.max(max, i - start);
        }

        return max;
    }
}
