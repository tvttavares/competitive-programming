package Arcade.Intro.Exploring_the_Waters;


import java.util.HashMap;
import java.util.Map;

public class MapFindIfExists {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{2, 1, 3};

        System.out.println(areSimilar(a, b));
    }

    private static boolean areSimilar(int[] a, int[] b) {
        Map<Integer, Integer> mp1 = new HashMap<>();
        Map<Integer, Integer> mp2 = new HashMap<>();

        for (int aa : a) {
            mp1.putIfAbsent(aa, 0);
            mp1.put(aa, mp1.get(aa) + 1);
        }

        for (int bb : b) {
            mp2.putIfAbsent(bb, 0);
            mp2.put(bb, mp2.get(bb) + 1);
        }

        return mp1.entrySet().stream().allMatch(e -> e.getValue().equals(mp2.get(e.getKey())));
    }
}
