package Algorithms.Sorting;

import java.util.List;

public class IntroToTutorialChallenges {

    public static int introTutorial(int V, List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == V) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
