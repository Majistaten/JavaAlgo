package com.javaalgo.project.sort;

/**
 * Selection sort algorithm.
 *
 * @author Tobias Hansson
 */
public class SelectionSort extends BaseSorter {

    /**
     * Constructor for the sorting algorithm.
     *
     * @param values the array to be sorted
     */
    protected SelectionSort(int[] values) {
        super(values);
    }

    /**
     * Sorting method for selection sort.
     *
     * @return the sorted array.
     */
    @Override
    public int[] execute() {
        /*
            Selection sort it a sorting algorithm that finds the lowest value in the array and places it at the correct
            position in the array.
         */
        for (int targetIndex = 0; targetIndex < getArray().length; targetIndex++) {
            int minValueIndex = targetIndex;
            for (int compareIndex = targetIndex + 1; compareIndex < getArray().length; compareIndex++) {
                if (getArray()[compareIndex] < getArray()[minValueIndex]) {
                    minValueIndex = compareIndex;
                }
            }
            int tempValue = getArray()[targetIndex];
            getArray()[targetIndex] = getArray()[minValueIndex];
            getArray()[minValueIndex] = tempValue;
        }

        return getArray();
    }
}
