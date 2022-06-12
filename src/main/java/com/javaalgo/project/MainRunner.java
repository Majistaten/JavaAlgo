package com.javaalgo.project;

import com.javaalgo.project.search.BinarySearch;
import com.javaalgo.project.search.ExponentialSearch;
import com.javaalgo.project.search.LinearSearch;
import com.javaalgo.project.support.Timer;

public class MainRunner {
    public static void main(String[] args) {
        // create array with values from 1 to 100
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        LinearSearch linear = new LinearSearch(array);
        BinarySearch binary = new BinarySearch(array);
        ExponentialSearch exponential = new ExponentialSearch(array);

        for (int i = 0; i < 10000; i++) {
            Timer linearTimer = new Timer(linear);
            linearTimer.timeSearch(950);
            Timer binaryTimer = new Timer(binary);
            binaryTimer.timeSearch(950);
            Timer exponentialTimer = new Timer(exponential);
            exponentialTimer.timeSearch(950);
        }
    }
}
