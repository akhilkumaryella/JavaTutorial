package coding;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/merge-sorted-array/
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 */
public class MergeTwoSortedArrays {

    public static void main(String[] args) {

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;

        merge(nums1, m, nums2, n);

        Arrays.stream(nums1).forEach(System.out::println);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int l = nums1.length - 1;

        m--;
        n--;

        while(l >= 0) {

            if(m < 0) {
                nums1[l--] = nums2[n--];
            } else if(n < 0) {
                nums1[l--] = nums1[m--];
            } else {
                if(nums1[m] > nums2[n]) {
                    nums1[l--] = nums1[m--];
                } else {
                    nums1[l--] = nums2[n--];
                }
            }
        }
    }
}
