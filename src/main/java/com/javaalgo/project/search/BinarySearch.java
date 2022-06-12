package com.javaalgo.project.search;

public class BinarySearch extends Searcher {

    /**
     * Constructor for BinarySearch.
     * @param array the array to be searched.
     */
    public BinarySearch(int[] array) {
        super(array);
    }

    /**
     * Search method for BinarySearch.
     * @param key the key to find.
     * @return the index of the key if found, -1 otherwise.
     */
    @Override
    public int search(int key) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
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
