package Arcade.Intro.Island_Of_Knowledge;

import java.util.Arrays;

public class AvoidObstacles {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 6, 9, 7};

        System.out.println(avoidObstacles(arr));
    }

    private static int avoidObstacles(int[] inputArray) {
        int jump = 1;
        Arrays.sort(inputArray);
        boolean fail = true;
        while (fail) {
            jump++;
            fail = false;
            for (int input : inputArray)
                if (input % jump == 0) {
                    fail = true;
                    break;
                }
        }
        return jump;
    }

}
