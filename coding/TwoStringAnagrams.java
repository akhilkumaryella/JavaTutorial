package coding;

import java.util.Arrays;

/**
 * https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/
 * Anagram - if two strings contains same character including count
 */
public class TwoStringAnagrams {

    public static void main(String[] args) {

        String str1 = "abade";
        String str2 = "adaeb";
        System.out.println(anagramsApproach1(str1.toCharArray(), str2.toCharArray()));
        System.out.println(anagramsApproach2(str1.toCharArray(), str2.toCharArray()));
        System.out.println(anagramsApproach3(str1.toCharArray(), str2.toCharArray()));
        System.out.println(anagramsOptimal(str1.toCharArray(), str2.toCharArray()));

    }

    // TC: o(nlogn)
    static boolean anagramsApproach1(char[] ch1, char[] ch2) {

        if(ch1.length != ch2.length) return false;

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for(int i = 0; i < ch1.length; i++) {
            if(ch1[i] != ch2[i]) return false;
        }

        return true;
    }

    // count characters
    // possible characters - 256
    static boolean anagramsApproach2(char[] ch1, char[] ch2) {

        if(ch1.length != ch2.length) return false;

        int[] count1 = new int[256];
        int[] count2 = new int[256];

        for(int i = 0; i < ch1.length; i++) {
            count1[ch1[i]]++;
            count2[ch2[i]]++;
        }
        for(int i = 0; i < count1.length; i++) {
            if(count1[i] != count2[i]) return false;
        }

        return true;
    }

    // count characters with single array
    // possible characters - 256
    static boolean anagramsApproach3(char[] ch1, char[] ch2) {

        if(ch1.length != ch2.length) return false;

        int[] count = new int[256];

        for(int i = 0; i < ch1.length; i++) {
            count[ch1[i]]++;
            count[ch2[i]]--;
        }
        for(int i = 0; i < count.length; i++) {
            if(count[i] != 0)return false;
        }

        return true;
    }


    // calculating all characters ASCII sum if both are same then true
    static boolean anagramsOptimal(char[] ch1, char[] ch2) {

        if(ch1.length != ch2.length) return false;

        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < ch1.length; i++) {
            sum1 += ch1[i];
            sum2 += ch2[i];
        }

        return sum1 == sum2;

    }


}
