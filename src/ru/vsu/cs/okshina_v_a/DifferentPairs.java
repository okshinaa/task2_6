package ru.vsu.cs.okshina_v_a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DifferentPairs {
    public static List<Integer> findPairsWithForLoop(int[] input, int sum) {
        final List<Integer> allDifferentPairs = new ArrayList<>();
        final Map<Integer, Integer> pairs = new HashMap<>();
        for (int i : input) {
            if (pairs.containsKey(i)) {
                if (pairs.get(i) != null) {
                    allDifferentPairs.add(i);
                }
                pairs.put(sum - i, null);
            } else if (!pairs.containsKey(i)) {
                pairs.put(sum - i, i);
            }
        }
        return allDifferentPairs;
    }
}