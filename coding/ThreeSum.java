package coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/3sum/
 * https://www.youtube.com/watch?v=onLoX6Nhvmg&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=41&ab_channel=takeUforward
 */
public class ThreeSum {

    public static void main(String[] args) {

        System.out.println(threeSum(new int []{-1,0,1,2,-1,-4}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> out = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {

            if(i != 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;
            int target = -1 * nums[i];
            while(left < right) {
                if(target == nums[left] + nums[right]) {
                    out.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left - 1]) left++;
                    while(left < right && nums[right] == nums[right + 1]) right--;
                } else if(target < nums[left] + nums[right]) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return out;
    }


}
