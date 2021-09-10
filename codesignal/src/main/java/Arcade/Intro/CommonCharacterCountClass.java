package Arcade.Intro;

import java.util.ArrayList;
import java.util.List;

public class CommonCharacterCountClass {

    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "adcaa";
        System.out.println(commonCharacterCount(s1, s2));
    }

    static int commonCharacterCount(String s1, String s2) {
        int count = 0;
        List<Character> list = new ArrayList<>();
        char cc;
        for (char c : s1.toCharArray()) {
            list.add(c);
        }

        for (int i = 0; i < s2.length(); i++) {
            cc = s2.toCharArray()[i];

            if (list.contains(cc)) {
                list.remove(list.indexOf(cc));
                count++;
            }
        }
        return count;
    }

}


