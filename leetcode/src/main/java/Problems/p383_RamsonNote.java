package Problems;

import java.util.HashMap;
import java.util.Map;

public class p383_RamsonNote {

    public static boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> map = new HashMap<>();
        boolean isValid = true;

        for (char c : magazine.toCharArray()) {
            map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (map.containsKey(c)) {
                Integer value = map.get(c);
                if (value > 0) {
                    map.put(c, map.get(c) - 1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return isValid;
    }

    public static void main(String[] args) {
//        System.out.println(canConstruct("a", "b"));
//        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
    }
}
