package com.javaalgo.project.search;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {
    private final int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private final LinearSearch linearSearch = new LinearSearch(array);

    @BeforeEach
    void setUp() {
    }

    @BeforeAll
    static void setUpBeforeClass() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void searchExisting() {
        assertEquals(4, linearSearch.execute(5));
        assertEquals(9, linearSearch.execute(10));
    }

    @Test
    void searchNonExisting() {
        assertEquals(-1, linearSearch.execute(11));
        assertEquals(-1, linearSearch.execute(-5));
    }
}