package Problems;

public class p848_ShiftingLetters {

    public static String shiftingLetters(String s, int[] shifts) {
        // Convert the string to a char array for in-place modifications
        char[] chars = s.toCharArray();
        int n = chars.length;

        // Compute cumulative shifts from the end to the start
        int cumulativeShift = 0;
        for (int i = n - 1; i >= 0; i--) {
            cumulativeShift = (cumulativeShift + shifts[i]) % 26;
            chars[i] = (char) (((chars[i] - 'a' + cumulativeShift) % 26) + 'a');
        }

        // Convert the char array back to a string and return
        return new String(chars);
    }

    // Solution 1
//    public static String shiftingLetters(String s, int[] shifts) {
//
//        for (int i = 0; i < shifts.length; i++) {
//            int number = shifts[i];
//            String subString = s.substring(0, i + 1);
//            String finalString = s.substring(i + 1);
//
//            char[] stringArray = subString.toCharArray();
//
//            StringBuilder sb = new StringBuilder();
//            for (char c : stringArray) {
//                char shiftedChar = (char) (((c - 'a' + number) % 26) + 'a');
//                sb.append(shiftedChar);
//            }
//            sb.append(finalString);
//            s = sb.toString();
//        }
//
//        return s;
//    }

    public static void main(String[] args) {
        System.out.println(shiftingLetters("abc", new int[]{3, 5, 9}));
    }
}
