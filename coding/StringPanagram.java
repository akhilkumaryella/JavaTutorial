package coding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Panagram - if String contains all alphabets then its a panagram
 */
public  class StringPanagram {

    public static void main(String[] args) {

        String s1 = "abcdefghijklmnopqrsTUVwxyz";
        System.out.println(isPangram(s1));

        String s2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(isPangram(s1));

        String s3 = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(isPangram(s3));

        String s4 = "abgtiifxddyijkhffyfhk";
        System.out.println(isPangram(s4));


    }

    public static boolean isPangram(String input) {

        boolean[] occurences = new boolean[26];
        for(char c : input.toCharArray()) {
            occurences[Character.toLowerCase(c) - 'a'] = true;
        }

        for(boolean b : occurences) {
            if(!b) return false;
        }
        return true;
    }
}
