package coding;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    public static String longestCommonPrefix(String[] strs) {


        for(int i = 0; i < strs[0].length(); i++) {

            char c = strs[0].charAt(i);

            for(int j = 1; j < strs.length; j++) {

                if(strs[j].length() - 1 < i) {
                    return strs[j];
                }

                if(strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }
}
