package Algorithms.Implementation;

import java.util.HashMap;
import java.util.Map;

public class HappyLadybug {

    public static String happyLadybugs(String b) {
        String res = "YES";
        Map<String, Integer> map = new HashMap<>();

        for (char c : b.toCharArray()) {
            map.merge(String.valueOf(c), 1, Integer::sum);
        }

        boolean containsUnderscore = map.containsKey("_");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (!entry.getKey().equals("_") && entry.getValue() == 1) {
                res = "NO";
                return res;
            }
        }

        if (!containsUnderscore) {
            char[] c = b.toCharArray();
            for (int i = 1; i < c.length; i++) {
                if (c[i - 1] != c[i] && c[i] != c[i + 1]) {
                    res = "NO";
                    return res;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(happyLadybugs("AABCBC"));
    }
}
