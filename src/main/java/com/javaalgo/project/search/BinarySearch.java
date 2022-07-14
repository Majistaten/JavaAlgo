package com.javaalgo.project.search;

/**
 * Binary search object that is used to search a key in a sorted array.
 *
 * @author Tobias Hansson
 */
public class BinarySearch extends BaseSearcher {

    /**
     * Constructor for BinarySearch.
     *
     * @param array sorted array to be searched.
     */
    public BinarySearch(final int[] array) {
        super(array);
    }

    /**
     * Search method for BinarySearch.
     *
     * @return the index of the key if found, -1 otherwise.
     */
    @Override
    public int[] execute() {
        /*
            If the key is greater than the middle element, the search only needs to be performed on the right half of the array.
            If the key is less than the middle element, the search only needs to be performed on the left half of the array.
            If the key is equal to the middle element, the search is complete.
        */

        int low = 0;   // Set low array index
        int high = array.length - 1;   // Set high array index

        while (low <= high) {
            int mid = (low + high) / 2;   // Set the target to middle index.
            if (array[mid] == key) {
                return new int[]{key, mid};   // Key found, return key and index.
            } else if (array[mid] < key) {   // Key is smaller than target, search within lower indexes.
                low = mid + 1;
            } else {   // Key is bigger than target, search within higher indexes.
                high = mid - 1;
            }
        }
        return new int[]{key, -1};
    }
}
