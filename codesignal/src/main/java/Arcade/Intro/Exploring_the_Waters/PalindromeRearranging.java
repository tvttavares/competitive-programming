package Arcade.Intro.Exploring_the_Waters;

import java.util.HashMap;
import java.util.Map;

public class PalindromeRearranging {

    public static void main(String[] args) {
        String a = "aabbc";

        System.out.println(palindromeRearranging(a));
    }

    private static boolean palindromeRearranging(String inputString) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : inputString.toCharArray()) {
            map.putIfAbsent(c, 0);
            map.put(c, map.get(c) + 1);
        }

        boolean isPalindrome = true;
        int uniqueCount = 0;

        for (int i : map.values()) {
            if (i % 2 != 0) {
                uniqueCount++;
                if (uniqueCount != 1) {
                    isPalindrome = false;
                    break;
                }
            }
        }

        return isPalindrome;
    }
}
