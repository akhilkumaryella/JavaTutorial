package coding;

/**
 * https://www.geeksforgeeks.org/reverse-words-in-a-given-string/
 */
public class ReverseWordsInArray {

    public static void main(String[] args) {

        System.out.println(reverse("getting good at coding needs a lot of practice"));
        System.out.println(reverse("geeks quiz practice code"));
    }

    public static String reverse(String input) {

        String[] str = input.split(" ");

        for(int i = 0; i < str.length / 2; i++) {
            String temp = str[i];
            str[i] = str[str.length - 1 - i];
            str[str.length - 1 - i] = temp;
        }

        return String.join(" ", str);
    }

}
