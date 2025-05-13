package Problems;

import java.util.HashMap;
import java.util.Map;

public class p3335_TotalCharactersInStringAfterTransformationsI {

    private static final int mod = 1000000007;

    private static int mod_add(int a, int b) {
        a %= mod; b %= mod;
        return ((a + b) % mod + mod) % mod;
    }

    public static int lengthAfterTransformations(String s, int t) {
        int[] nums = new int[26];
        for (char ch : s.toCharArray()) nums[ch - 'a']++;
        while (t-- > 0) {
            int[] cur = new int[26];
            for (int j = 0; j < 26; j++) {
                if (j == 25 && nums[j] > 0) {
                    cur[0] = mod_add(cur[0], nums[j]);
                    cur[1] = mod_add(cur[1], nums[j]);
                } else {
                    if (j < 25) cur[j + 1] = mod_add(cur[j + 1], nums[j]);
                }
            }
            nums = cur;
        }
        int ans = 0;
        for (int i : nums) ans = mod_add(ans, i);
        return ans;
    }

//    Solution 3
//    public static int lengthAfterTransformations(String s, int t) {
//        // Step 1: Initialize the frequency map for characters
//        int[] characterMap = new int[26]; // Use long to handle large counts
//        for (char c : s.toCharArray()) {
//            characterMap[c - 'a']++;
//        }
//
//        // Step 2: Perform transformations
//        while (t-- > 0) {
//            int[] nextCharacterMap = new int[26];
//
//            for (int i = 0; i < 26; i++) {
//                if (characterMap[i] == 0) continue;
//
//                if (i == 25) { // Handle 'z'
//                    nextCharacterMap[0] += characterMap[i]; // 'z' -> 'a'
//                    nextCharacterMap[1] += characterMap[i]; // 'z' -> 'b'
//                } else {
//                    nextCharacterMap[i + 1] += characterMap[i]; // Shift to the next character
//                }
//            }
//            characterMap = nextCharacterMap;
//        }
//
//        // Step 3: Calculate total length
//        int totalLength = 0;
//        for (int count : characterMap) {
//            totalLength += count;
//        }
//        return totalLength;
//    }


//    Solution 2
//    public static int lengthAfterTransformations(String s, int t) {
//        Map<Character, Integer> characterMap = new HashMap<>();
//        for (int i = 0; i < 26; i++) {
//            characterMap.put((char) ('a' + i), 0);
//        }
//
//        for (char c : s.toCharArray()) {
//            characterMap.put(c, characterMap.get(c) + 1);
//        }
//
//
//        while (t-- > 0) {
//            Map<Character, Integer> nextCharacterMap = new HashMap<>(characterMap);
//
//            for (Map.Entry<Character, Integer> entry : characterMap.entrySet()) {
//                if (entry.getValue() == 0) {
//                    continue;
//                }
//
//                Character c = entry.getKey();
//                Integer v = entry.getValue();
//                while (v-- > 0) {
//                    if (entry.getKey() == 'z') {
//                        nextCharacterMap.put(c, nextCharacterMap.get(c) - 1);
//                        nextCharacterMap.put('a', nextCharacterMap.get('a') + 1);
//                        nextCharacterMap.put('b', nextCharacterMap.get('b') + 1);
//                    } else {
//                        Character shiftedChar = (char) (((c - 'a' + 1) % 26) + 'a');
//                        nextCharacterMap.put(c, nextCharacterMap.get(c) - 1);
//                        nextCharacterMap.put(shiftedChar, nextCharacterMap.get(shiftedChar) + 1);
//                    }
//                }
//
//            }
//            characterMap = nextCharacterMap;
//        }
//        return characterMap.values().stream().reduce(Integer::sum).get();
//    }
//    // Solution 1
//    public static int lengthAfterTransformations(String s, int t) {
//        Map<Character, Integer> characterMap = new HashMap<>();
//
//        for (int i = 0; i < 26; i++) {
//            characterMap.put((char) ('a' + i), 0);
//        }
//
//        for (char c : s.toCharArray()) {
//            characterMap.put(c, characterMap.get(c) + 1);
//        }
//
//        while (t --> 0) {
//            StringBuilder stringBuilder = new StringBuilder();
//            for (char c : s.toCharArray()) {
//                if (c == 'z') {
//                    characterMap.put(c, characterMap.get(c) - 1);
//                    characterMap.put('a', characterMap.get('a') + 1);
//                    characterMap.put('b', characterMap.get('b') + 1);
//
//                    stringBuilder.append("ab");
//                } else {
//                    Character shiftedChar = (char) (((c - 'a' + 1) % 26) + 'a');
//                    characterMap.put(c, characterMap.get(c) - 1);
//                    characterMap.put(shiftedChar, characterMap.get(shiftedChar) + 1);
//
//                    stringBuilder.append(shiftedChar);
//                }
//            }
//            s = stringBuilder.toString();
//        }
//
//        return characterMap.values().stream().reduce(Integer::sum).get();
//    }

    public static void main(String[] args) {
//        System.out.println(lengthAfterTransformations("abcyy", 2));
        System.out.println(lengthAfterTransformations("jqktcurgdvlibczdsvnsg", 7517));
//        System.out.println(lengthAfterTransformations("azbk", 1));
//        System.out.println(lengthAfterTransformations("k", 10));
    }
}
