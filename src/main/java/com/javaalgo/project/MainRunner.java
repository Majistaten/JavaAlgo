package com.javaalgo.project;

import com.javaalgo.project.gui.MainWindow;
import com.javaalgo.project.search.BinarySearch;
import com.javaalgo.project.search.ExponentialSearch;
import com.javaalgo.project.search.LinearSearch;
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

        LinearSearch linear = new LinearSearch(array);
        BinarySearch binary = new BinarySearch(array);
        ExponentialSearch exponential = new ExponentialSearch(array);

        for (int i = 0; i < 10000; i++) {
            int key = random.nextInt(1000);
            Timer linearTimer = new Timer(linear);
            linearTimer.timeSearch(key);
            Timer binaryTimer = new Timer(binary);
            binaryTimer.timeSearch(key);
            Timer exponentialTimer = new Timer(exponential);
            exponentialTimer.timeSearch(key);
        }
        MainWindow mainWindow = new MainWindow("Algoholic");
        int[] arr = new int[1000];
        for(int i=0; i<1000; i++){
            arr[i] = i/3;
        }
        mainWindow.updateArray(arr);
    }
}
