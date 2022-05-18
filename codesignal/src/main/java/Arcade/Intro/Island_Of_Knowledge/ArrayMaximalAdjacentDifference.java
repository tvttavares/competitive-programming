package Arcade.Intro.Island_Of_Knowledge;

public class ArrayMaximalAdjacentDifference {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 1, 0};

        System.out.println(arrayMaximalAdjacentDifference(arr));
    }

    private static int arrayMaximalAdjacentDifference(int[] inputArray) {
        int diff = 0;
        int d;
        for (int i = 0; i < inputArray.length - 1; i++) {
            d = Math.abs(inputArray[i] - inputArray[i + 1]);
            if (d > diff) {
                diff = d;
            }
        }
        return diff;
    }
}
