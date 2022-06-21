package com.javaalgo.project.search;

/**
 * Exponential search object that is used to search a key in a sorted array.
 *
 * @author Tobias Hansson
 */
public class ExponentialSearch extends BaseSearcher {

    /**
     * Constructor for ExponentialSearch.
     *
     * @param array sorted array to be searched.
     * @param key   the key to be searched for.
     */
    public ExponentialSearch(final int[] array, final int key) {
        super(array, key);
    }

    /**
     * Search method for ExponentialSearch.
     *
     * @return the index of the key if found, -1 otherwise.
     */
    @Override
    public int[] execute() {
        /*
            Exponential search finds a range within the array that may contain the key by multiplying the low index by 2
            until the low index value is higher than the key and then uses binary search to find the key between array
            index low and array index low divided by two.
        */

        int low = 1;
        int high = array.length - 1;

        // See if the key is located at the first index.
        if (array[0] == key) {
            return new int[]{key, 0};
        }
        // Find the range that is out of scope for the key.
        while (low < high && array[low] <= key) {
            low *= 2;
        }

        // Set high and low to the range that may contain the key.
        high = Math.min(high, low);
        low /= 2;

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
        return new int[]{key, -1};   // Key not found, return key and "not found" index.
    }
}
