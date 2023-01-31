package com.blankspace.csdn.pattern.strategy.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortStrategyTest {

    @Test
    public void insertSortStrategyTest() {
        SortStrategy<Integer> strategy = new InsertSortStrategy<>();
        Integer[] actualData = new Integer[]{3, 4, 2, 6, 1, 5};
        Integer[] expectedData = new Integer[]{1, 2, 3, 4, 5, 6};
        strategy.sort(actualData);
        Assertions.assertArrayEquals(expectedData, actualData);
    }

    @Test
    public void bubbleSortStrategyTest() {
        SortStrategy<Integer> strategy = new BubbleSortStrategy<>();
        Integer[] actualData = new Integer[]{3, 4, 2, 6, 1, 5};
        Integer[] expectedData = new Integer[]{1, 2, 3, 4, 5, 6};
        strategy.sort(actualData);
        Assertions.assertArrayEquals(expectedData, actualData);
    }

}
