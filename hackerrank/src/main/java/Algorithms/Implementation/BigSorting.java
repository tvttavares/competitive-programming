package Algorithms.Implementation;

import java.util.*;
import java.util.stream.Collectors;

public class BigSorting {

    public static List<String> bigSorting(List<String> unsorted) {
        // List<String> sorted = Arrays.stream(unsorted.stream().map(Integer::new).toArray()).sorted().map(String::valueOf).collect(Collectors.toList());
        unsorted = new ArrayList<>(unsorted);
        // Sort using a custom comparator
        unsorted.sort((a, b) -> {
            // Compare by length first
            if (a.length() != b.length()) {
                return Integer.compare(a.length(), b.length());
            }
            // If lengths are equal, compare lexicographically
            return a.compareTo(b);
        });
        return unsorted;
    }

    public static void main(String[] args) {
        System.out.println(bigSorting(List.of("6",
                "31415926535897932384626433832795",
                "1",
                "3",
                "10",
                "3",
                "5")));
    }
}
