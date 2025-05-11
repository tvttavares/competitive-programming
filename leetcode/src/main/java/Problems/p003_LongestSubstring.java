package Problems;

import java.util.*;
import java.util.stream.Collectors;

public class p003_LongestSubstring {

        public static int lengthOfLongestSubstring(String s) {
            int maxLength = 0;

            for (int i = 0; i < s.length(); i++) {
                Set<Character> charSet = new HashSet<>();
                for (int j = i ; j <  s.length(); j++) {
                    char c = s.charAt(j);
                    if (charSet.contains(c)) {
                        break; // Stop expanding this substring if a duplicate is found
                    }
                    charSet.add(c);
                    maxLength = Math.max(maxLength, j - i + 1); // Update max length
                }
            }

            return maxLength;
}

//    // Solution 1
//    public static int lengthOfLongestSubstring(String s) {
//        int length = 0;
//        Set<String> subStringsSet = new HashSet<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i + 1; j <= s.length(); j++) {
//                subStringsSet.add(s.substring(i, j));
//            }
//        }
//
//        List<String> subStrings = subStringsSet.stream().distinct().sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList());
//
//        for (String ss : subStrings) {
//            boolean found = false;
//            List<Character> characterList = new ArrayList<>();
//            for (char c : ss.toCharArray()) {
//                if (characterList.contains(c)) {
//                    found = true;
//                    break;
//                } else {
//                    characterList.add(c);
//                }
//            }
//
//            if (found) {
//                continue;
//            }
//            return ss.length();
//        }
//
//        return length;
//    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
