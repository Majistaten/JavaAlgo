package com.javaalgo.project;

import com.javaalgo.project.gui.GraphView;
import com.javaalgo.project.gui.MainWindow;
import com.javaalgo.project.search.LinearSearch;
import com.javaalgo.project.support.Timer;

import javax.swing.*;

public class MainRunner {
    public static void main(String[] args) {
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

    }
}
