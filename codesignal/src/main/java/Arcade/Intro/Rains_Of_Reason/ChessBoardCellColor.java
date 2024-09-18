package Arcade.Intro.Rains_Of_Reason;

public class ChessBoardCellColor {

    public static void main(String[] args) {
        String cell1 = "A1";
        String cell2 = "H3";
        System.out.println(matchingColors(cell1, cell2));
    }

    private static boolean matchingColors(String cell1, String cell2) {
        // Extract the column and row information from the input cells
        int c1 = cell1.charAt(0) - 'A'; // Convert 'A'-'H' to 0-7
        int r1 = cell1.charAt(1) - '1'; // Convert '1'-'8' to 0-7
        int c2 = cell2.charAt(0) - 'A'; // Convert 'A'-'H' to 0-7
        int r2 = cell2.charAt(1) - '1'; // Convert '1'-'8' to 0-7

        // Cells are the same color if both the sum of row and column are even or both are odd
        return (c1 + r1) % 2 == (c2 + r2) % 2;
    }
}
