package com.javaalgo.project;

import com.javaalgo.project.search.BinarySearch;
import com.javaalgo.project.search.ExponentialSearch;
import com.javaalgo.project.search.LinearSearch;
import com.javaalgo.project.search.Searcher;
import com.javaalgo.project.support.Timable;
import com.javaalgo.project.support.Timer;

import java.util.Arrays;
import java.util.Random;

public class MainRunner {
    public static void main(String[] args) {
        Random random = new Random();
        // create array with values from 1 to 100
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        array = Arrays.stream(array).sorted().toArray();

        Searcher[] searchers = new Searcher[] {
                new LinearSearch(array, 0),
                new BinarySearch(array, 0),
                new ExponentialSearch(array, 0)
        };
        for (int i = 0; i < 10000; i++) {
            int key = random.nextInt(1000);
            Timer timer;
            for (Searcher searcher : searchers) {
                searcher.setKey(key);
                timer = new Timer(searcher);
                timer.timeSearch(key);
            }
        }
    }
}
