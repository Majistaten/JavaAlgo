package com.javaalgo.project.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest extends TestBaseSort {

    @BeforeEach
    void setUp() {
        this.baseSort = new InsertionSort(unsorted);
    }

    @Test
    void sort() {
        assertArrayEquals(sorted, baseSort.execute());
    }
}