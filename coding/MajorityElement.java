package coding;

/**
 * https://leetcode.com/problems/majority-element/
 * majority element occurrences more than combined occurrences of remaining elements
 * Algorithm : moore's voting algorithm
 * problem explanation: https://www.youtube.com/watch?v=AoX3BPWNnoE&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=15
 * Algorithm explanation: https://www.youtube.com/watch?v=X0G5jEcvroo&ab_channel=AnujBhaiya
 */
public class MajorityElement {

    public static void main(String[] args) {

        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    // moore's voting algorithm
    public static int majorityElement(int[] nums) {

        int count = 0;
        int element = 0;

        for(int i : nums){
            if(count == 0) element = i;

            if(element == i) count++;
            else count -= 1;
        }

        return element;
    }
}
