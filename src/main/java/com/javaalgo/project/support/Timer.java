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
        String keySeparator = " ".repeat(4 - String.valueOf(key).length());
        String resultSeparator = " ".repeat(4 - String.valueOf(result).length());
        String log = String.format(searcher.getClass().getName() + " - " + key + keySeparator + " found at: " + result + resultSeparator + " in " + duration + " nanoseconds.");
        ResultLogger.INSTANCE.info(log);
    }
}
