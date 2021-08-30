package Algorithms.Implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AllLongestStringsClass {

    public static void main(String[] args) {
        String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};
        for (String s : allLongestStrings(inputArray)) {
            System.out.print(s + " ");
        }
    }

    static String[] allLongestStrings(String[] inputArray) {
        Arrays.sort(inputArray, Comparator.comparingInt(String::length));
        int maxL = inputArray[inputArray.length - 1].length();
        List<String> list = new ArrayList<>();
        for (String s : inputArray) {
            if (s.length() == maxL) {
                list.add(s);
            }
        }

        return list.toArray(new String[0]);
    }

}
