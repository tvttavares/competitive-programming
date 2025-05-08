package Problems;

public class p415_AddStrings {

    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = i >= 0 ? Character.getNumericValue(num1.charAt(i))   : 0;
            int digit2 = j >= 0 ? Character.getNumericValue(num2.charAt(j))   : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result.append(sum % 10);

            i--;
            j--;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addStrings("9999999999", "1"));
    }
}
