package com.javaalgo.project.search;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SearcherTest {
    private static final int arrayTop = 40;
    private static final int[] array = new int[arrayTop];
    private static final List<BaseSearcher> searchers = new ArrayList<>();

    @BeforeAll
    static void setUp() {
        for (int i = 1; i < arrayTop; i++) {
            array[i - 1] = i;
        }
        searchers.add(new LinearSearch(array, 0));
        searchers.add(new BinarySearch(array, 0));
        searchers.add(new ExponentialSearch(array, 0));
    }

    private void changeKey(int key) {
        searchers.forEach(searcher -> searcher.setKey(key));
    }
    @Test
    void searchExisting() {
        searchers.forEach(searcher -> {
            changeKey(5);
            assertArrayEquals(new int[] {5, 4}, searcher.execute());
            changeKey(10);
            assertArrayEquals(new int[] {10, 9}, searcher.execute());
            changeKey(arrayTop - 1);
            assertArrayEquals(new int[] {arrayTop - 1, arrayTop - 2}, searcher.execute());
        });
    }

    @Test
    void searchNonExisting() {
        searchers.forEach(searcher -> {
            changeKey(arrayTop + 1);
            assertArrayEquals(new int[] {arrayTop + 1, -1}, searcher.execute());
            changeKey(-5);
            assertArrayEquals(new int[] {-5, -1}, searcher.execute());
        });
    }
}
