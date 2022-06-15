package com.javaalgo.project.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    private final int[] unsorted = {5, 4, 3, 2, 1, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    private final int[] sorted = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    private InsertionSort insertionSort;

    @BeforeEach
    void setUp() {
        insertionSort = new InsertionSort(unsorted);
    }

    @Test
    void sort() {
        assertArrayEquals(sorted, insertionSort.execute());
    }
}