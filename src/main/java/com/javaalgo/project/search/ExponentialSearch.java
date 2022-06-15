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
        int bottom = 0;
        int top = 2;
        int max = array.length - 1;
        if (array[bottom] == key) {
            return new int[] {key, bottom};
        }
        while (top < max && array[top] <= key) {
            bottom = top;
            top = (int) Math.pow(top, 2);
            if (top > max) {
                top = max;
            }
        }
        while (bottom < top) {
            int mid = bottom + (top - bottom) / 2;
            if (array[mid] == key) {
                return new int[] {key, mid};
            } else if (array[mid] < key) {
                bottom = mid + 1;
            } else {
                top = mid - 1;
            }
        }
        return new int[] {key, -1};
    }
}
