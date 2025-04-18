package Algorithms.Implementation;

import java.util.ArrayList;
import java.util.List;

public class FairRations {

    static String fairRations(List<Integer> B) {
        B = new ArrayList<>(B);
        int res = 0;

        for (int i = 0; i < B.size() - 1; i++) {
            if (B.get(i) % 2 != 0) {
                B.set(i + 1, B.get(i + 1) + 1);
                res += 2;
            }
        }

        return B.get(B.size() - 1) % 2 == 0 ? String.valueOf(res) : "NO";
    }

    public static void main(String[] args) {
        System.out.println(fairRations(List.of(2, 3, 4, 5, 6)));
    }
}
