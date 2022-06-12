package com.javaalgo.project.search;

public class ExponentialSearch extends Searcher {

    /**
     * Constructor for ExponentialSearch.
     * @param array the array to be searched.
     */
    public ExponentialSearch(int[] array) {
        super(array);
    }

    /**
     * Search method for ExponentialSearch.
     * @param key the key to find.
     * @return the index of the key if found, -1 otherwise.
     */
    @Override
    public int search(int key) {
        int low = 0;
        int high = array.length - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
