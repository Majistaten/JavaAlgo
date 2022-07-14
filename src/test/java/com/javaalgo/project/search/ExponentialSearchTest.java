package com.javaalgo.project.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExponentialSearchTest {

    private final int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private ExponentialSearch exponentialSearch;

    @BeforeEach
    void setUp() {
        exponentialSearch = new ExponentialSearch(array);
    }

    @Test
    void execute() {
        exponentialSearch.setKey(5);
        assertArrayEquals(new int[] {5, 4}, exponentialSearch.execute());
        exponentialSearch.setKey(10);
        assertArrayEquals(new int[] {10, 9}, exponentialSearch.execute());
    }
}