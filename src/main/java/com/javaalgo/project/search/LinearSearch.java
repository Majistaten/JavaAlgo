package com.javaalgo.project.search;

/**
 * Linear search algorithm used as base case for efficiency estimation.
 * @author Tobias Hansson
 */
public class LinearSearch implements Searchable {
    int[] array;
    int arrayLength;

    /**
     * Constructor for LinearSearch.
     * @param array the array to be searched.
     */
    public LinearSearch(final int[] array) {
        this.array = array;
        this.arrayLength = array.length;
    }

    /**
     * Search method for LinearSearch.
     * @param key the key to be searched.
     * @return the index of the key if found, -1 otherwise.
     */
    public int search(final int key) {
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
