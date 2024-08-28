package Arcade.Intro.Island_Of_Knowledge;

public class Minesweeper {

    public static void main(String[] args) {

        boolean[][] entryMatrix =
                {
                        {true, false, false},
                        {false, true, false},
                        {false, false, false}
                };

        int[][] mineSweeperMatrix = mineSweeper(entryMatrix);

        for (int i = 0; i < mineSweeperMatrix.length; i++) {
            for (int j = 0; j < mineSweeperMatrix[i].length; j++) {
                System.out.print(mineSweeperMatrix[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] mineSweeper(boolean[][] matrix) {
        int xLength = matrix.length;
        int yLength = matrix[0].length;
        int[][] result = new int[xLength][yLength];

        // Define the possible directions: up, down, left, right, and the four diagonals
        int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};

        for (int i = 0; i < xLength; i++) {
            for (int j = 0; j < yLength; j++) {
                int count = 0;

                // Check all 8 directions
                for (int k = 0; k < 8; k++) {
                    int newX = i + dx[k];
                    int newY = j + dy[k];

                    // Ensure the new coordinates are within bounds
                    if (newX >= 0 && newX < xLength && newY >= 0 && newY < yLength && matrix[newX][newY]) {
                        count++;
                    }
                }

                result[i][j] = count;
            }
        }
        return result;
    }

}
