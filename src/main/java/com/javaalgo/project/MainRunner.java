package com.javaalgo.project;

import com.javaalgo.project.gui.MainWindow;
import com.javaalgo.project.search.BinarySearch;
import com.javaalgo.project.search.ExponentialSearch;
import com.javaalgo.project.search.LinearSearch;
import com.javaalgo.project.search.BaseSearcher;
import com.javaalgo.project.sort.BaseSorter;
import com.javaalgo.project.support.ResultLogger;
import com.javaalgo.project.support.Timer;

import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;

public class MainRunner {
    public static void main(String[] args) {
        int arrayLength = 100000;   // Length of array
        int valuesTop = 100000;   // Top of key value range
        int loopCount = 10000;   // Number of times to run algorithms

        Random random = new Random();
        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(valuesTop);   // Generate random array, there may be duplicates
//            array[i] = i;   // for visual testing purposes, every value is equal to its index
        }

        array = Arrays.stream(array).sorted().toArray();

        int testKey = 189500;

        BaseSearcher linear = new LinearSearch(array);
        Timer timeTaker = new Timer(linear, true);
        linear.setKey(testKey);
        BaseSearcher binary = new BinarySearch(array);
        binary.setKey(testKey);
        BaseSearcher expo = new ExponentialSearch(array);
        expo.setKey(testKey);

        ResultLogger.INSTANCE.log(Level.INFO, "Solo linear time.");
        timeTaker.timeSearch();
        ResultLogger.INSTANCE.log(Level.INFO, "Solo binary time.");
        timeTaker.setSearcher(binary);
        timeTaker.timeSearch();
        ResultLogger.INSTANCE.log(Level.INFO, "Solo expo time.");
        timeTaker.setSearcher(expo);
        timeTaker.timeSearch();


//        MainWindow mainWindow = new MainWindow("Algoholic");
//        int[] arr = BaseSorter.generateArray(1000, 500);
//        mainWindow.updateArray(arr);
    }
}
