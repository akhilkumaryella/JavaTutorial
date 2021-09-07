package coding;

import java.util.HashMap;
import java.util.Map;

/**
 * Algorithm:
 * Approach : Sliding Window Technique
 * Time complicity : O(n)
 * 1. HashMap used for storing Character and index
 * 2. right is for iterating though each index
 * 3. left is for from which index we have non repeating chars available
 * 4. we have store each char and its index in map
 * 5. while storing if there is any char already present in map then repetition is there
 * 6. So, we have to jump left index from its previous position to next index of repetitive character previous index
 * 7. when ever repetition occurs calculates the length of string
 */
public class LongestSubstringWithoutRepetition {

    public static void main(String[] args) {

        String s = "abcdefabghijkl";

        // storing character and index
        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        int right = 0;
        int n = s.length();
        int len = 0;

        while(right < n) {

            if(map.containsKey(s.charAt(right))) {
                len = Math.max(right - left, len);
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            }
            map.put(s.charAt(right), right);
            right++;
        }

        System.out.println(Math.max(right - left, len));
    }
}
