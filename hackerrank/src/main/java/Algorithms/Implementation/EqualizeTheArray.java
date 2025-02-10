package Algorithms.Implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualizeTheArray {

    static int equalizeArray(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        arr.forEach(a -> map.put(a, map.getOrDefault(a, 0) + 1));
        int maxRecurringNumber = map.values().stream().max(Integer::compare).orElse(0);
        return arr.size() - maxRecurringNumber;
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);

        System.out.println(equalizeArray(list));
    }
}
