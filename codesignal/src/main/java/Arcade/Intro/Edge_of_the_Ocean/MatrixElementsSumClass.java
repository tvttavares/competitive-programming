package Arcade.Intro.Edge_of_the_Ocean;

public class MatrixElementsSumClass {

    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 1, 2}, {0, 5, 0, 0}, {2, 0, 3, 3}};
        System.out.println(matrixElementsSum(matrix));
    }

    static int matrixElementsSum(int[][] matrix) {
        int sum = 0;
        boolean haunt = false;

        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 0) {
                   break;
                }
                if (matrix[i][j] != 0) {
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
    }
}
