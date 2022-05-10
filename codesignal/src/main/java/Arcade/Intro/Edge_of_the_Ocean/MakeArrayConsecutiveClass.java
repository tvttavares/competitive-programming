package Arcade.Intro.Edge_of_the_Ocean;

public class MakeArrayConsecutiveClass {

    public static int makeArrayConsecutive2(int[] statues) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i : statues) {
            if (i > max) max = i;
            if (i < min) min = i;
        }

        return (max - min) + 1 - statues.length;
    }
}
