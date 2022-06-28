package com.javaalgo.project.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest extends TestBaseSort{

    @BeforeEach
    void setUp() {
        this.baseSort = new SelectionSort(unsorted);
    }

    @Test
    void sort() {
        assertArrayEquals(sorted, baseSort.execute());
    }
}