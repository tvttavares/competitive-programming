package Algorithms.Implementation;

import java.util.ArrayList;
import java.util.List;

public class ServiceLane {

    public static List<Integer> serviceLane(List<Integer> widthList, List<List<Integer>> cases) {
        List<Integer> result = new ArrayList<>();

        for (List<Integer> cc : cases) {
            int min = Integer.MAX_VALUE;
            for (int i = cc.get(0); i <= cc.get(1); i++) {
                int width = widthList.get(i);
                if (width < min) {
                    min = width;
                }
            }
            result.add(min);
        }

        return result;
    }

    public static void main(String[] args) {

        serviceLane(List.of(2, 3, 1, 2, 3, 2, 3, 3), List.of(List.of(0, 3), List.of(4, 6), List.of(6, 7), List.of(3, 5), List.of(0, 7)));
    }
}
