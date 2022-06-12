package com.javaalgo.project.search;

/**
 * Linear search algorithm used as base case for efficiency estimation.
 * @author Tobias Hansson
 */
public class LinearSearch extends Searcher {

    /**
     * Constructor for LinearSearch.
     * @param array the array to be searched.
     */
    public LinearSearch(final int[] array, final int key) {
        super(array, key);
    }

    /**
     * Search method for LinearSearch.
     * @return the index of the key if found, -1 otherwise.
     */
    @Override
    public int execute() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }


}
