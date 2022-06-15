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
        int low = 0;
        int high = array.length - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (array[mid] == key) {
                return new int[] {key, mid};
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return new int[] {key, -1};
    }
}
