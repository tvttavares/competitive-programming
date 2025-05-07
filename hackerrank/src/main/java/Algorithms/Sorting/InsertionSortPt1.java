package Algorithms.Sorting;

import java.util.ArrayList;
import java.util.List;

public class InsertionSortPt1 {

    public static void insertionSort1(int n, List<Integer> arr) {
        arr = new ArrayList<>(arr);
        int numb = arr.get(arr.size() - 1);
        boolean stop = false;
        for (int i = arr.size() - 1; i >= 0; i--) {
            int tmp2 = i == 0 ? 0 : arr.get(i - 1);

            if (numb < tmp2) {
                arr.set(i, tmp2);
            } else if (numb > tmp2) {
                arr.set(i, numb);
                stop = true;
            }

            for (int j = 0; j < arr.size(); j++) {
                System.out.print(arr.get(j) + " ");
            }
            System.out.println();
            if (stop) {
                break;
            }
        }

    }

    public static void main(String[] args) {
        insertionSort1(10, List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 1));
    }
}
