package coding;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/majority-element-ii/
 * Algo tutorial: https://www.youtube.com/watch?v=qZloazsMZ8k&ab_channel=VivekanandKhyade-AlgorithmEveryDay
 * problem explanation: https://www.youtube.com/watch?v=yDbkQd9t2ig&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=17&ab_channel=takeUforward
 */
public class MajorityElementII {

    public static void main(String[] args) {

        int[] nums = {2,1,1,3,1,4,5,6};
        System.out.println(majorityElement(nums));
    }

    // moore's voting algorithm
    public static List<Integer> majorityElement(int[] nums) {

        int element1 = 0;
        int element2 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i : nums) {
            if(element1 == i) {
                count1++;
            } else if(element2 == i) {
                count2++;
            } else if(count1 == 0) {
                element1 = i;
                count1++;
            } else if(count2 == 0) {
                element2 = i;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        List<Integer> out = new ArrayList<>();
        count1 = 0;
        count2 = 0;
        for(int i : nums) {

            if(element1 == i) count1++;
            else if(element2 == i) count2++;
        }

        if(count1 > nums.length / 3) out.add(element1);
        if(count2 > nums.length / 3) out.add(element2);

        return out;

    }
}
