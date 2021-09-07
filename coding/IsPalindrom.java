package coding;

public class IsPalindrom {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(122));
    }

    public static boolean isPalindrome(int x) {

        if(x < 0 || (x % 10 == 0 && x != 0)) return false;

        int rev = 0;

        while(x > rev) {
            rev = (rev * 10) + (x % 10);
            x = x / 10;
        }

        return rev == x || x == rev / 10;
    }
}
