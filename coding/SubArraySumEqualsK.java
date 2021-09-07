package coding;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/subarray-sum-equals-k/
 */
public class SubArraySumEqualsK {

    public static void main(String[] args) {

        subarraySumOptimize(new int[]{1,2,3}, 3);
    }
            //O(n^3)
        public int subarraySum(int[] nums, int k)
        {
            int count=0;//counter for counting the number of subarray sum is equals to k
            for(int i=0;i<nums.length;i++)//picks the starting point
            {
                for(int j=i;j<nums.length;j++)//pics the ending point
                {
                    int sum=0;//to calculate each subarray sum freshly
                    for(int l=i;l<=j;l++)//subarray starting from index i and ending point j
                    {
                        sum+=nums[l];//calculating the particular subarray sum
                    }
                    if(sum==k)//if desired sum is reached, increasing the count
                        count+=1;
                }
            }
            return count;//returning the subarrrays count satisfying the sum condition
        }

        public static  int subarraySumOptimize(int[] nums, int k)
        {//O(n)
            int count=0,sum=0;
            HashMap<Integer,Integer> map=new HashMap<>();//sum and their corresponding frequency
            map.put(0,1);//zero sum of 1 frequency

            for(int i=0;i<nums.length;i++)//travesing the array
            {
                sum+=nums[i];//calculating the running sum or the prefix sum

                if(map.containsKey(sum-k))//we are searching for any sum-k is there or not and what is its frequency
                {
                    count+=map.get(sum-k);//whats the frequeny (sum-k) value and adding that to count, as we find the range in which the subarray lies whoes sum will be k
                }

                map.put(sum,map.getOrDefault(sum,0)+1);//calculating the frequeny of every running sum and purting it into the HashMap
            }
            return count;

        }

}
