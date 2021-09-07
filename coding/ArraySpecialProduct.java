package coding;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/product-of-array-except-self/
 */
public class ArraySpecialProduct {

    public static void main(String[] args) {

        Arrays.stream(productExceptSelf(new int[]{1,2,3,4})).forEach(i -> System.out.print(i +" "));
        System.out.println();
        Arrays.stream(productExceptSelfOptimal(new int[]{1,2,3,4})).forEach(i -> System.out.print(i +" "));

    }

    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];

        leftProduct[0] = 1;
        rightProduct[n - 1] = 1;

        for(int i = 1; i < nums.length; i++) {
            leftProduct[i] =  nums[i - 1] * leftProduct[i - 1];
        }

        for(int i = n - 2; i >= 0; i--) {
            rightProduct[i] = nums[i + 1] * rightProduct[i + 1];
        }

        for(int i = 0; i < nums.length; i++) {
            nums[i] = leftProduct[i] * rightProduct[i];

        }

        return nums;
    }

    public static int[] productExceptSelfOptimal(int[] nums) {

        int n = nums.length;

        int[] output = new int[n];

        output[0] = 1;

        for(int i = 1; i < nums.length; i++) {
            output[i] =  nums[i - 1] * output[i - 1];
        }

        int rightProduct = 1;
        for(int i = n - 1; i >= 0; i--) {
            output[i] = output[i] * rightProduct;
            rightProduct *= nums[i];
        }


        return output;
    }
}
