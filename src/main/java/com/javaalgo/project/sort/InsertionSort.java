package com.javaalgo.project.sort;

/**
 * Insertion sort algorithm.
 *
 * @author Tobias Hansson
 */
public class InsertionSort extends BaseSorter {

    /**
     * Constructor for InsertionSort.
     *
     * @param array the array to be sorted.
     */
    public InsertionSort(int[] array) {
        super(array);
    }

    /**
     * Sort method for InsertionSort.
     *
     * @return the sorted array.
     */
    @Override
    public int[] execute() {
        /*
            Insertion sort is a simple sorting algorithm that builds the final sorted array one item at a time.
            Insertion sort iterates through the array, growing a sorted array behind the current element.
            It takes the current element and compares it to the elements behind it in the sorted array and places the
            current element in its correct position where it is smaller than the next value and bigger or equal to the
            previous.
         */
        for (int index = 1; index <= getArray().length - 1; index++) {
            int focusValue = getArray()[index];   // Set the current element to focus.
            int compareIndex = index - 1;   // Set the index to compare to.

            // Compare the current element to the elements behind it in the sorted array.
            while (compareIndex >= 0 && getArray()[compareIndex] > focusValue) {
                getArray()[compareIndex + 1] = getArray()[compareIndex];  // Shift the elements to the right.
                compareIndex--; // Move to the previous element.
            }
            getArray()[compareIndex + 1] = focusValue; // Place the current element in the correct position.
        }
        return getArray(); // Return the sorted array.
    }
}
