package coding;

import java.util.Arrays;

/**
 * https://www.geeksforgeeks.org/minimum-number-platforms-required-railwaybus-station/
 * https://www.youtube.com/watch?v=dxVcMDI7vyI&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=46&ab_channel=takeUforward
 */
public class MinimumPlatforms {

    public static void main(String[] args) {

        int arrival[] = { 900, 940, 950, 1100, 1500, 1800 };
        int departure[] = { 910, 1200, 1120, 1130, 1900, 2000 };

        System.out.println(findPlatforms(arrival, departure, arrival.length));
    }

    public static int findPlatforms(int[] arrival, int[] departure, int n) {

        Arrays.sort(arrival);
        Arrays.sort(departure);

        int platfromsAtOnce = 1;
        int maxPlatforms = 1;

        int i = 1;
        int j = 0;

        while(i < n && j < n) {

            if(arrival[i] <= departure[j]) {
                platfromsAtOnce++;
                i++;
            } else {
                platfromsAtOnce--;
                j++;
            }

            maxPlatforms = Math.max(maxPlatforms, platfromsAtOnce);
        }

        return maxPlatforms;
    }
}
