package Algorithms.Implementation;

import java.util.*;
import java.util.stream.Collectors;

public class BookSale {
    private static boolean ASC = true;

    public static int nthLowestSelling(int[] sales, int n) {

        List<Integer> list = Arrays.stream(sales).boxed().sorted().collect(Collectors.toList());
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer i : list) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.putIfAbsent(i, 1);
            }
        }
        Map<Integer, Integer> sortedMap = sortByValue(map, ASC);
        List<Integer> listN = new ArrayList<>(sortedMap.values());

        return listN.get(n - 1);
    }

    private static Map<Integer, Integer> sortByValue(Map<Integer, Integer> unsortMap, final boolean order) {
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(unsortMap.entrySet());

        // Sorting the list based on values
        list.sort((o1, o2) -> order ? o1.getValue().compareTo(o2.getValue()) == 0
                ? o1.getKey().compareTo(o2.getKey())
                : o1.getValue().compareTo(o2.getValue()) : o2.getValue().compareTo(o1.getValue()) == 0
                ? o2.getKey().compareTo(o1.getKey())
                : o2.getValue().compareTo(o1.getValue()));
        return list.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> b, LinkedHashMap::new));
    }

    public static void main(String[] args) {
        int x = nthLowestSelling(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 5, 4, 3, 5, 4, 5}, 2);
        System.out.println(x);
    }
}