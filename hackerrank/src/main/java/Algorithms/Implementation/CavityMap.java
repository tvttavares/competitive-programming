package Algorithms.Implementation;

import java.util.ArrayList;
import java.util.List;

public class CavityMap {

    public static List<String> cavityMap(List<String> grid) {
        // Write your code here
        grid = new ArrayList<>(grid);
        for (int i = 0; i < grid.size(); i++) {
            String s = grid.get(i);
            char[] c = s.toCharArray();

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < grid.size(); j++) {
                char cc = c[j];

                sb.append(cc);
                if (i == 0 || i == grid.size() - 1 || j == 0 || j == grid.size() - 1) {
                    continue;
                }

                int num = cc;
                String above = grid.get(i - 1);
                char[] ca = above.toCharArray();

                String below = grid.get(i + 1);
                char[] cb = below.toCharArray();

                if (num > c[j - 1] && num > c[j + 1] && num > ca[j] && num > cb[j]) {
                    sb.replace(j, j + 1, "X");
                }

            }
            grid.set(i, sb.toString());
        }


        return grid;
    }


    public static void main(String[] args) {
        System.out.println(cavityMap(List.of("989", "191", "111")));
    }
}
