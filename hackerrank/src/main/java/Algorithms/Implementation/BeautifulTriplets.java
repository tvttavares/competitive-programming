package Algorithms.Implementation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BeautifulTriplets {

    private static int beautifulTriplets(int d, List<Integer> arr) {
        // a[j] - a[i] == a[k] - a[j] == d
        // Changing the equation:
        // a[j] = a[i] + d and a[k] = a[j] + d = a[i] + 2d
//                for (int i = 0; i < arr.size(); i++) {
//            for (int j = 0; j < arr.size(); j++) {
//                for (int k = 0; k < arr.size(); k++) {
//                    if (k == j || j == i || i == k || i > j || i > k || j > k) {
//                        continue;
//                    }
//                    int op1 = arr.get(j) - arr.get(i);
//                    int op2 = arr.get(k) - arr.get(j);
//                    if (op1 == op2 && op1 == d) {
//                        sumBeautifulTriplets++;
//                    }
//                }
//            }
//        }

        int sumBeautifulTriplets = 0;
        Set<Integer> elements = new HashSet<>(arr);

        for (int value : arr) {
            if (elements.contains(value + d) && elements.contains(value + 2 * d)) {
                sumBeautifulTriplets++;
            }
        }
        return sumBeautifulTriplets;
    }

    public static void main(String[] args) {

        System.out.println(beautifulTriplets(1, List.of(2, 2, 3, 4, 5)));
    }


}
