package coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/merge-intervals/
 */
public class  MergeIntervals {

    public static void main(String[] args) {
       int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};

       merge(intervals);

    }

    public static int[][] merge(int[][] intervals) {

        if(intervals.length == 0) {
            return new int[0][];
        }

        // sort given array
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int[] a : intervals) {

            if(a[0] <= end) {
                end = Math.max(end, a[1]);
            } else {
                result.add(new int[]{start, end});
                start = a[0];
                end = a[1];
            }
        }

        result.add(new int[]{start, end});

        return result.toArray(new int[0][]);

    }
}
