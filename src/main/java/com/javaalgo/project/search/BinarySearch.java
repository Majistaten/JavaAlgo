package com.javaalgo.project.search;

public class BinarySearch extends BaseSearcher {

    /**
     * Constructor for BinarySearch.
     * @param array the array to be searched.
     */
    public BinarySearch(final int[] array, final int key) {
        super(array, key);
    }

    /**
     * Search method for BinarySearch.
     * @return the index of the key if found, -1 otherwise.
     */
    @Override
    public int[] execute() {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
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
