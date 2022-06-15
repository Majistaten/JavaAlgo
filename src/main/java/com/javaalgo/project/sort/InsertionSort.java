package com.javaalgo.project.sort;

public class InsertionSort extends BaseSorter {

    public InsertionSort(int[] array) {
        super(array);
    }

    @Override
    public int[] execute() {
        for (int index = 1; index <= getArray().length - 1; index++) {
            int focusValue = getArray()[index];
            int compareIndex = index - 1;

            while (compareIndex >= 0 && getArray()[compareIndex] > focusValue) {
                getArray()[compareIndex + 1] = getArray()[compareIndex];
                compareIndex--;
            }
            getArray()[compareIndex + 1] = focusValue;
        }
        return getArray();
    }
}
