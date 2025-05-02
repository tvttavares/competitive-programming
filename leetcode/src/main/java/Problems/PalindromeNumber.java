package Problems;

public class PalindromeNumber {

    static boolean isPalindrome(int x) {

        String stringNumber = String.valueOf(x);
        StringBuilder sb = new StringBuilder(stringNumber);
        sb.reverse();

        return stringNumber.contentEquals(sb);

//        # Solution 2
//        String stringNumber = String.valueOf(x);
//        boolean isPalindrome = false;
//        boolean isEven = stringNumber.length() % 2 == 0;
//
//        if (isEven) {
//            int middle = stringNumber.length() / 2;
//            StringBuilder sb1 = new StringBuilder();
//            StringBuilder sb2 = new StringBuilder();
//            sb1.append(stringNumber.substring(0, middle));
//            sb2.append(stringNumber.substring(middle, stringNumber.length()));
//            sb2 = sb2.reverse();
//            return sb1.toString().equals(sb2.toString()) ? true : false;
//        } else {
//            int middle = stringNumber.length() / 2;
//            StringBuilder sb1 = new StringBuilder();
//            StringBuilder sb2 = new StringBuilder();
//            sb1.append(stringNumber.substring(0, middle));
//            sb2.append(stringNumber.substring(middle + 1, stringNumber.length()));
//            sb2 = sb2.reverse();
//
//            return sb1.toString().equals(sb2.toString()) ? true : false;
//        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(100));
    }
}
