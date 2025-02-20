package Algorithms.Implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumDistances {

    public static int minimumDistances(List<Integer> a) {
        int minDistance = Integer.MAX_VALUE;

//        Map<Integer, List<Integer>> map = new HashMap<>();
        Map<Integer, Integer> lastSeen = new HashMap<>();
        for (int i = 0; i < a.size(); i++) {
            int current = a.get(i);
            if (lastSeen.containsKey(current)) {
                int distance = i - lastSeen.get(current);
                minDistance = Math.min(minDistance, distance);
            }
            lastSeen.put(current, i);

//            List<Integer> list;
//            if (map.containsKey(a.get(i))) {
//                list = map.get(a.get(i));
//            } else {
//                list = new ArrayList<>();
//            }
//            list.add(i);
//            map.put(a.get(i), list);
        }
//
//        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
//            if (entry.getValue().size() < 2) {
//                continue;
//            }
//
//            int listMinValue = entry.getValue().stream().reduce(0, (x, y) -> y - x);
//            if (listMinValue < minDistance) {
//                minDistance = listMinValue;
//            }
//
//        }

        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }

    public static void main(String[] args) {
        System.out.println(minimumDistances(List.of(7, 1, 3, 4, 1, 7)));
    }
}
