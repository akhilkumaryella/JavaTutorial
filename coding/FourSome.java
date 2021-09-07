package coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * https://leetcode.com/problems/4sum/
 */
public class FourSome {

    public static void main(String[] args) {
        long s1 = System.currentTimeMillis();
        System.out.println(fourSum(new int[]{2,2,2,2,2}, 8));
        long s2 = System.currentTimeMillis();
        System.out.println(s2 - s1);
        System.out.println(fourSumOptimise(new int[]{2,2,2,2,2,}, 8));
        long s3 = System.currentTimeMillis();
        System.out.println(s3 - s2);
    }

    // bruteforce - o(n^3logn)
    public static List<List<Integer>> fourSum(int[] nums, int target) {

        HashSet<List<Integer>> out = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                for(int k = j + 1; k < n; k++) {
                    int low = k + 1;
                    int high = n - 1;
                    while(low <= high) {
                        int mid = low + (high - low) / 2;
                        if(nums[mid] == target - (nums[i] + nums[j] + nums[k])) {
                            out.add(List.of(nums[i], nums[j], nums[k], nums[mid]));
                            break;
                        } else if(nums[mid] < target - (nums[i] + nums[j] + nums[k])) {
                            low  = mid + 1;
                        } else {
                            high = mid - 1;
                        }
                    }
                }
            }
        }

        return new ArrayList<>(out);
    }

    public static List<List<Integer>> fourSumOptimise(int[] nums, int target) {

        List<List<Integer>> out = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < n; i++) {

            if(i != 0 && nums[i] == nums[i - 1]) continue;

            for(int j = i + 1; j < n; j++) {

                if(j != i + 1 && nums[j] == nums[j - 1]) continue;

                int front = j + 1;
                int back = n - 1;
                int tempTarget = target - nums[i] - nums[j];
                while(front < back) {
                    if(tempTarget < nums[front] + nums[back]) {
                        back--;
                    } else if(tempTarget > nums[front] + nums[back]) {
                        front++;
                    } else {
                        out.add(List.of(nums[i], nums[j], nums[front], nums[back]));
                        front++;
                        back--;
                        while(front < back && nums[front] == nums[front - 1]) front++;
                        while(front < back && nums[back] == nums[back + 1]) back--;
                    }
                }
            }
        }

        return out;
    }
}
