package Arcade.Intro.Island_Of_Knowledge;

import java.util.Arrays;

public class BoxBlur {

    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 1,},
                {1, 7, 1,},
                {1, 1, 1}
        };

        int[][] image2 = {
                {7, 4, 0, 1},
                {5, 6, 2, 2},
                {6, 10, 7, 8},
                {1, 4, 2, 0}
        };

        System.out.println(Arrays.deepToString(boxBlur(image)));
        System.out.println(Arrays.deepToString(boxBlur(image2)));
    }

    public static int[][] boxBlur(int[][] image) {
        int height = image.length;
        int width = image[0].length;
        int[][] blurredImage = new int[height - 2][width - 2];

        for (int i = 0; i < height - 2; i++) {
            for (int j = 0; j < width - 2; j++) {
                int sum = 0;
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        sum += image[k][l];
                    }
                }
                blurredImage[i][j] = sum / 9;
            }
        }

        return blurredImage;
    }


}
