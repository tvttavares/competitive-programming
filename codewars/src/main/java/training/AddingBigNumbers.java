package training;

public class AddingBigNumbers {

    public static String add(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = i >= 0 ? Character.getNumericValue(a.charAt(i)) : 0;
            int digit2 = j >= 0 ? Character.getNumericValue(b.charAt(j)) : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            sb.append(sum % 10);

            i--;
            j--;
        }

        sb.reverse();

        if (sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(add("1", "9999999"));
    }
}
