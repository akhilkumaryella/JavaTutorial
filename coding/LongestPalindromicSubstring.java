package coding;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/
 */
public class LongestPalindromicSubstring {

    int resultStart;
    int resultLength;

    public static void main(String[] args) {

        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();

        System.out.println(lps.longestPalindrome("asdfasdffdsawe"));
    }

    public String longestPalindrome(String s) {

        if (s == null || s.length() < 2) return s;

        for (int i = 0; i < s.length(); i++) {
            expandFromMiddle(s, i, i);
            expandFromMiddle(s, i, i + 1);
        }

        return s.substring(resultStart, resultStart + resultLength);
    }

    public void expandFromMiddle(String s, int left, int right) {


        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        if (resultLength < right - left - 1) {

            resultLength = right - left - 1;
            resultStart = left + 1;
        }

    }
}
