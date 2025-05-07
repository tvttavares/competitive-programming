package MockExams;

import java.util.ArrayList;
import java.util.List;

/**
Actually, let's think about this more carefully:
For each position i in the outer loop (which runs n times):
*   First inner loop runs i times
*   Second inner loop runs (n-i) times

So for each i, we're doing approximately i + (n-i) = n operations.
And wedo this n times (outer loop).
This makes the total time complexity O(n²), not O(n).
However, this is still better than the previous solution because:
1.  String substring operations take O(n) time
2.  String concatenation also takes O(n) time
3.  So the previous solution with string operations was also O(n²) but with much higher constant factors due to string creation and copying
**/

/**
I see you're interested in improving further! Here are some key areas to focus on:
1.  Code Optimization:
*   Could add early validation checks (e.g., checking if str1.length() != str2.length() + 1)
*   Could break out of the outer loop early in certain conditions

2.  Code Structure:
*   Consider extracting the character comparison logic into a separate helper method
*   Add input validation
*   Add comments for complex logic

3.  Problem-Solving Skills:
*   Practice analyzing time complexity before implementing
*   Consider space-time tradeoffs
*   Think about edge cases first

4.  Java-specific:
*   Learn more about String vs StringBuilder performance characteristic
*   Understand when to use different data structures
*   Practice using Java 8+ features effectively
**/

public class MockInterview {

    public static List<Integer> getRemovableIndices(String str1, String str2) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            boolean matches = true;
            for (int j = 0; j < i; j++) {
                char c1 = str1.charAt(j);
                char c2 = str2.charAt(j);
                if (c1 != c2) {
                    matches = false;
                    break;
                }
            }

            for (int j = i + 1; j < str1.length(); j++) {
                char c1 = str1.charAt(j);
                char c2 = str2.charAt(j - 1);
                if (c1 != c2) {
                    matches = false;
                    break;
                }
            }

            if (matches) {
                res.add(i);
            }
        }


//        Solution 1
//        for (int i=0;i<str1.length();i++) {
//            String st1tmp1 = str1.substring(0, i);
//            String st1tmp2 = str1.substring(i+1);
//
//            String tmp3 = st1tmp1 + st1tmp2;
//
//            if (tmp3.equals(str2)) {
//                res.add(i);
//            }
//        }

        if (res.isEmpty()) {
            res.add(-1);
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(getRemovableIndices("abdgggda", "abdggda"));
//        System.out.println(getRemovableIndices("aabbb", "aabb"));

    }
}
