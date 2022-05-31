package ru.vsu.cs.okshina_v_a;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class TestOfFindingPairs {
    private final int[] inputArr;
    private final int sum;
    private final List<Integer> expectedResult;

    public TestOfFindingPairs(int[] inputArr, int sum, List<Integer> expectedResult) {
        this.inputArr = inputArr;
        this.sum = sum;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static List<Object[]> cases() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 5, List.of(3, 4)},
                {new int[]{0, -1, -2}, -2, List.of(-2)},
                {new int[]{2, 4, 6, 8, 10, 12, 13, -2}, 6, List.of(4, -2)},
        });
    }

    @Test
    public void findPairsTest() {
        List<Integer> actualResult = DifferentPairs.findPairsWithForLoop(inputArr, sum);
        Assert.assertEquals(expectedResult, actualResult);
    }
}