package coding;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * https://www.youtube.com/watch?v=Fm_p9lJ4Z_8&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=43&ab_channel=takeUforward
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

    // TC: o(n) SC: o(1)
    public static int removeDuplicates(int[] nums) {

        if(nums.length == 0) return 0;

        int i = 0;

        for(int j = 1; j < nums.length; j++) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}
