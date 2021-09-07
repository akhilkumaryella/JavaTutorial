package coding;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 */
public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        System.out.println(firstUniqCharApproach1("leetcode"));
        System.out.println(firstUniqCharApproach2("leetcode"));
    }

    public static int firstUniqCharApproach1(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for(Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static int firstUniqCharApproach2(String s) {

        int[] arr = new int[26];

        for(Character c : s.toCharArray()) {
            arr[c - 'a']++;
        }

        for(int i = 0; i < s.length(); i++) {
            if(arr[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
