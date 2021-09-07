package coding;

import java.util.Arrays;

/**
 * Leetcode - https://leetcode.com/problems/sort-colors/
 * input - {0,1,2,2,1,0,2,2,1,1,0,0}
 * output - {0,0,0,0,1,1,1,1,2,2,2,2}
 * Solution - Dutch National Flag Algorithm - o(n)
 */
public class SortingColors {


    public static void main(String[] args) {

        SortingColors obj = new SortingColors();
        int[] input = {0,1,2,2,1,0,2,2,1,1,0,0};
        obj.sort(input);
        printElements(input);

        obj.sortColors(input);
        printElements(input);
    }


    // o(nlogn)
    public void sort(int [] nums) {

        Arrays.sort(nums);
    }

    // o(n)
    // Dutch National Flag Algorithm
    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high) {
            switch(nums[mid]) {
                case 0:
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, high);
                    high--;
                    break;

            }
        }
    }

    private void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void printElements(int[] input) {
        for(int i : input) {
            System.out.print(i +" ");
        }
        System.out.println();
    }
}
