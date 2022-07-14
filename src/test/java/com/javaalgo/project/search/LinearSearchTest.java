package com.javaalgo.project.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {
    private final int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private LinearSearch linearSearch;

    @BeforeEach
    void setUp() {
        linearSearch = new LinearSearch(array);
    }

    private void changeKey(int key) {
        linearSearch.setKey(key);
    }
    @Test
    void searchExisting() {
        changeKey(5);
        assertArrayEquals(new int[] {5, 4}, linearSearch.execute());
        changeKey(10);
        assertArrayEquals(new int[] {10, 9}, linearSearch.execute());
    }

    @Test
    void searchNonExisting() {
        changeKey(11);
        assertArrayEquals(new int[] {11, -1}, linearSearch.execute());
        changeKey(-5);
        assertArrayEquals(new int[] {-5, -1}, linearSearch.execute());
    }
}