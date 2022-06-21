package com.javaalgo.project.search;


/**
 * Linear search object that is used to search a key in an array.
 *
 * @author Tobias Hansson
 */
public class LinearSearch extends BaseSearcher {

    /**
     * Constructor for LinearSearch.
     *
     * @param array the array to be searched.
     * @param key   the key to be searched for.
     */
    public LinearSearch(final int[] array, final int key) {
        super(array, key);
    }

    /**
     * Search method for LinearSearch.
     *
     * @return the index of the key if found, -1 otherwise.
     */
    @Override
    public int[] execute() {
        /*
            Linear search finds the key in the array by iterating through the array and comparing each element to the key.
        */

        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return new int[]{key, i};
            }
        }
        return new int[]{key, -1};
    }

}
