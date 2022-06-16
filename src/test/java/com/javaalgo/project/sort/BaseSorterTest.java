package com.javaalgo.project.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseSorterTest {

    private final int[] array1 = {0,1,2,3,4,5,6,7,8,9};
    private final int[] array2 = {0,1,2,5,4,5,6,7,0,9};
    private final int[] array3 = {1,1,1,1,1,2,2,3,3,3};
    private final ExampleSorter sorter = new ExampleSorter();

    @Test
    void checkOrdered(){
        sorter.setArray(array1);
        assertEquals(true,sorter.isSorted());
    }
}