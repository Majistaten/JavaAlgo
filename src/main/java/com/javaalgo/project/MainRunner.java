package com.javaalgo.project;

import com.javaalgo.project.gui.GraphView;
import com.javaalgo.project.gui.MainWindow;
import com.javaalgo.project.search.LinearSearch;
import com.javaalgo.project.support.Timer;

import javax.swing.*;
import java.util.Random;

public class MainRunner {
    public static void main(String[] args) throws InterruptedException {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        LinearSearch linearSearch = new LinearSearch(array);
        for (int i = 0; i < 4; i++) {
            Timer timer = new Timer(linearSearch);
            timer.timeSearch(5);
            timer.timeSearch(10);
            timer.timeSearch(11);
            timer.timeSearch(-5);
        }
        MainWindow mainWindow = new MainWindow("Algoholic");
        //

        Random r = new Random();
        int[] arr = new int[1000];
        int peak = 300;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(r.nextFloat() * peak);
        }
        mainWindow.updateArray(arr);
        Thread.sleep(500);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i/3;
        }
        mainWindow.updateArray(arr);
    }
}
