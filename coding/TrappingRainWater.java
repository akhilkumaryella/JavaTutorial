package coding;

import java.util.Map;

/**
 * https://leetcode.com/problems/trapping-rain-water/
 * https://www.youtube.com/watch?v=m18Hntz4go8&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=42&ab_channel=takeUforward
 */
public class TrappingRainWater {

    public static void main(String[] args) {

        long time1 = System.nanoTime();
        System.out.println(trapBruteForce(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
        long time2 = System.nanoTime();
        System.out.println(time2 - time1);
        System.out.println(trapLeftMaxRightMaxArrays(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
        long time3 = System.nanoTime();
        System.out.println(time3 - time2);
    }

    // brute force - TC : o(n ^ 2) SC: o(1)
    // need to find how much water will store at each index
    // sum of all water stores at each index will be the answer
    // water stores at each index =
    // Math.min(maximum of left most buildings, maximum of right most buildings) - height of current building
    public static int trapBruteForce(int[] heights) {

        if(heights.length == 0) return 0;

        int water = 0;
        int leftMaxBuilding = heights[0];

        for(int i = 1; i < heights.length - 1; i++) {
            leftMaxBuilding = Math.max(leftMaxBuilding, heights[i]);
            int rightMaxBuilding = 0;
            for(int j = i; j < heights.length; j++) {
                rightMaxBuilding = Math.max(rightMaxBuilding, heights[j]);
            }
            water += Math.min(leftMaxBuilding, rightMaxBuilding) - heights[i];
        }

        return water;
    }

    // using left max array and right max array
    // TC: o(n) SC: o(2n);
    public static int trapLeftMaxRightMaxArrays(int[] heights) {

        int water = 0;
        int[] leftMaxArr = new int[heights.length];
        leftMaxArr[0] = heights[0];
        for(int i = 1; i < heights.length; i++) {
            leftMaxArr[i] = Math.max(leftMaxArr[i - 1], heights[i]);
        }
        int[] rightMaxArr = new int[heights.length];
        rightMaxArr[heights.length - 1] = heights[heights.length - 1];
        for(int i = heights.length - 2; i >= 0; i--) {
            rightMaxArr[i] = Math.max(rightMaxArr[i + 1], heights[i]);
        }

        for(int i = 0; i < heights.length; i++) {
            water += Math.min(leftMaxArr[i], rightMaxArr[i]) - heights[i];
        }

        return water;
    }

    // TC: o(n) SC: o(n)
    public static int trapOptimal(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;

        while(left < right) {

            if(height[left] <= height[right]) {

                if(leftMax < height[left]) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {

                if(rightMax < height[right]) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }

        return water;

    }

}
