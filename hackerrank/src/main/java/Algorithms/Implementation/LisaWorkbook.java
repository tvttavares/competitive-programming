package Algorithms.Implementation;

import java.util.List;

public class LisaWorkbook {

    public static int workbook(int n, int k, List<Integer> arr) {
        // Write your code here
        int magicNumber = 0;
        int pageNumber = 1;
        for (int i = 1; i <= n; i++) {
            int numberOfProblems = arr.get(i - 1);

            for (int j = 1; j <= numberOfProblems; j++) {
                if (j == pageNumber) {
                    magicNumber++;
                }
                if (j % k == 0) {
                    pageNumber++;
                }
            }
            if (numberOfProblems % k != 0) {
                pageNumber++;
            }
        }

        return magicNumber;
    }


    public static void main(String[] args) {
        System.out.println(workbook(5, 3, List.of(4, 2, 6, 1, 10)));
    }
}
