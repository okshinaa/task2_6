package ru.vsu.cs.okshina_v_a;

import java.util.ArrayList;
import java.util.List;

public class ExistingPairs {
    public static List<Integer> findPairsWithForLoop(int[] input, int sum) {
        final List<Integer> allExistingPairs = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (j != i && (input[i] + input[j]) == sum) {
                    allExistingPairs.add(input[i]);
                }
            }
        }
        return allExistingPairs;
    }
}