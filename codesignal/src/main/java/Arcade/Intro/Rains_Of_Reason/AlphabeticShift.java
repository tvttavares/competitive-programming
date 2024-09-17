package Arcade.Intro.Rains_Of_Reason;

public class AlphabeticShift {

    public static void main(String[] args) {
        String inputString = "crazy";
        System.out.println(shiftString(inputString));
    }

    private static String shiftString(String inputString) {
        StringBuilder result = new StringBuilder();

        for (char c : inputString.toCharArray()) {
            char newC = c == 'z' ? 'a' : (char) (c + 1);
            result.append(newC);
        }

        return result.toString();
    }
}
