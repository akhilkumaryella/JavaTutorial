package coding;

public class IntegerToRoman {

    public static void main(String[] args) {

        System.out.println(intToRoman(432));
        System.out.println(intToRoman(1876));
    }

    public static String intToRoman(int num) {

        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumbers = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder out = new StringBuilder();

        for(int i = 0; i < numbers.length; i++) {

            while(num >= numbers[i]) {
                out.append(romanNumbers[i]);
                num -= numbers[i];
            }
        }

        return out.toString();
    }
}
