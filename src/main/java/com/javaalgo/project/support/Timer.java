package com.javaalgo.project.support;

import com.javaalgo.project.search.Searcher;

public class Timer {
    Searcher searcher;

    public Timer(Searcher searcher) {
        this.searcher = searcher;
    }

    public void timeSearch(int key) {
        long startTime = System.nanoTime();
        int result = searcher.search(key);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Search for: " + result + " in " + duration + " nanoseconds.");
    }
}
