package Algorithms.Strings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SuperReducedString {

    public static String superReducedString(String s) {
        StringBuilder result = new StringBuilder();

        for (char current : s.toCharArray()) {
            if (result.length() > 0 && result.charAt(result.length() - 1) == current) {
                result.deleteCharAt(result.length() - 1);
            } else {
                result.append(current);
            }
        }

        return result.length() == 0 ? "Empty String" : result.toString();

//        List<Character> lc = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
//        Iterator<Character> ic = lc.iterator();
//        StringBuilder result = new StringBuilder();
//
//        while (ic.hasNext()) {
//            Character current = ic.next();
//
//            if (result.toString().isEmpty()) {
//                result.append(current);
//                continue;
//            }
//
//            Character lastSeen = result.charAt(result.length() - 1);
//
//            if (lastSeen.equals(current)) {
//                ic.remove();
//                result.deleteCharAt(result.length() - 1);
//                continue;
//            }
//            result.append(current);
//        }
//        String res = result.toString();
//        return res.isEmpty() ? "Empty String" : res;
    }

    public static void main(String[] args) {
        System.out.println(superReducedString("aaabccddd"));
    }
}
