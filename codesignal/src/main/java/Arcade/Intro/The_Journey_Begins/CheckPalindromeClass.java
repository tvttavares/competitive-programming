package Arcade.Intro.The_Journey_Begins;

public class CheckPalindromeClass {

    public static boolean checkPalindrome(String inputString) {

        char[] c = inputString.toCharArray();

        for (int i = 0; i < c.length / 2; i++) {
            if (c[i] != c[c.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

}
