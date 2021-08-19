package Algorithms.Implementation;

public class RoutePlanner {

    public static boolean routeExists(int fromRow, int fromColumn, int toRow, int toColumn,
                                      boolean[][] mapMatrix) {

        boolean[][] visited = new boolean[mapMatrix.length][mapMatrix[0].length];
        return routeExitsHelperMethod(fromRow, fromColumn, toRow, toColumn, mapMatrix, visited);
    }

    private static boolean routeExitsHelperMethod(int fromRow, int fromColumn, int toRow, int toColumn, boolean[][] mapMatrix, boolean[][] visited) {
        visited[fromRow][fromColumn] = true;

        if (fromRow == toRow && fromColumn == toColumn) {
            return true;
        } else {
            boolean left = false, right = false, up = false, down = false;

            if (validMove(mapMatrix, visited, fromRow + 1, fromColumn)) {
                right = routeExitsHelperMethod(fromRow + 1, fromColumn, toRow, toColumn, mapMatrix, visited);
            }

            if (validMove(mapMatrix, visited, fromRow - 1, fromColumn)) {
                left = routeExitsHelperMethod(fromRow - 1, fromColumn, toRow, toColumn, mapMatrix, visited);
            }

            if (validMove(mapMatrix, visited, fromRow, fromColumn + 1)) {
                up = routeExitsHelperMethod(fromRow, fromColumn + 1, toRow, toColumn, mapMatrix, visited);
            }

            if (validMove(mapMatrix, visited, fromRow, fromColumn - 1)) {
                down = routeExitsHelperMethod(fromRow - 1, fromColumn, toRow, toColumn, mapMatrix, visited);
            }
            return left || right || up || down;
        }
    }

    public static boolean validMove(boolean[][] mapMatrix, boolean[][] visited, int row, int column) {
        if (row > 0 && column >= 0 && row < mapMatrix.length && column < mapMatrix[row].length) {
            return mapMatrix[row][column] && !visited[row][column];
        }
        return false;
    }

    public static void main(String[] args) {
        boolean[][] mapMatrix = {
                {true, false, false},
                {true, true, false},
                {false, true, true}
        };

        System.out.println(routeExists(0, 0, 3, 3, mapMatrix));
    }
}
