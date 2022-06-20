package com.javaalgo.project;

import com.javaalgo.project.gui.MainWindow;
import com.javaalgo.project.search.BinarySearch;
import com.javaalgo.project.search.ExponentialSearch;
import com.javaalgo.project.search.LinearSearch;
import com.javaalgo.project.search.BaseSearcher;
import com.javaalgo.project.sort.BaseSorter;
import com.javaalgo.project.support.Timer;

import java.util.Arrays;
import java.util.Random;

public class MainRunner {
    public static void main(String[] args) {
        int arrayLength = 10000;
        int keyTop = 100000;
        int loopCount = 10000;

        Random random = new Random();
        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(keyTop);
            array[i] = i;
        }

        array = Arrays.stream(array).sorted().toArray();

        BaseSearcher[] baseSearchers = new BaseSearcher[] {
                new LinearSearch(array, 0),
                new BinarySearch(array, 0),
                new ExponentialSearch(array, 0)
        };
        for (int i = 0; i < loopCount; i++) {
            int key = random.nextInt(keyTop);
            Timer timer;
            for (BaseSearcher baseSearcher : baseSearchers) {
                baseSearcher.setKey(key);
                timer = new Timer(baseSearcher);
                timer.timeSearch(key);
            }
        }
//        MainWindow mainWindow = new MainWindow("Algoholic");
//        int[] arr = BaseSorter.generateArray(1000, 500);
//        mainWindow.updateArray(arr);
    }
}
