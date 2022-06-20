package com.javaalgo.project.search;

public class ExponentialSearch extends BaseSearcher {

    /**
     * Constructor for ExponentialSearch.
     * @param array the array to be searched.
     */
    public ExponentialSearch(final int[] array, final int key) {
        super(array, key);
    }

    /**
     * Search method for ExponentialSearch.
     * @return the index of the key if found, -1 otherwise.
     */
    @Override
    public int[] execute() {
        int low = 1;
        int high = array.length - 1;

        if (array[0] == key) {
            return new int[] {key, 0};
        }
        // Find the range that may contain the key.
        while (low < high && array[low] <= key) {
            low *= 2;
        }
        low /= 2;

        while (low <= high) {
            int mid = (low + high) / 2;   // Set the target to middle index.
            if (array[mid] == key) {
                return new int[] {key, mid};   // Key found, return key and index.
            } else if (array[mid] < key) {   // Key is smaller than target, search within lower indexes.
                low = mid + 1;
            } else {   // Key is bigger than target, search within higher indexes.
                high = mid - 1;
            }
        }
        return new int[] {key, -1};
    }
}
