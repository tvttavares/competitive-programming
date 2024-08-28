package Arcade.Intro.Rains_Of_Reason;

public class ArrayReplace {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 1};
        int elementToReplace = 1;
        int substituteElement = 3;

        int[] res = arrayReplace(arr, elementToReplace, substituteElement);
        System.out.println(res);
    }

    private static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == elemToReplace) {
                inputArray[i] = substitutionElem;
            }
        }
        return inputArray;
    }
}
