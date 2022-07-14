package com.javaalgo.project.support;

import com.javaalgo.project.search.BaseSearcher;
import com.javaalgo.project.search.BinarySearch;
import com.javaalgo.project.search.ExponentialSearch;
import com.javaalgo.project.search.LinearSearch;

import java.util.Arrays;
import java.util.Random;

public class Warmup {
    int arrayLength = 1000;   // Length of array
    int valuesTop = 1000;   // Top of key value range
    int loopCount = 10000;   // Number of times to run algorithms

    public void load() {

        Random random = new Random();
        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(valuesTop);   // Generate random array, there may be duplicates
//            array[i] = i;   // for visual testing purposes, every value is equal to its index
        }

        array = Arrays.stream(array).sorted().toArray();

        BaseSearcher[] baseSearchers = new BaseSearcher[] {
                new LinearSearch(array),
                new BinarySearch(array),
                new ExponentialSearch(array)
        };

        for (int i = 0; i < loopCount; i++) {
            int key = random.nextInt(valuesTop);
            Timer timer;
            for (BaseSearcher baseSearcher : baseSearchers) {
                baseSearcher.setKey(key);
                timer = new Timer(baseSearcher, true);
                timer.timeSearch();
            }
        }
    }
}
