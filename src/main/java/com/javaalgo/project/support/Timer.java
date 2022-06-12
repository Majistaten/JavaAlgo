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

        // TODO: Remove logging from timer and return the result instead.
        if (result != -1) {
        String log = String.format("%-20s key:%-5s found at:%-5s in %s nanoseconds.",
                searcher.getClass().getSimpleName(), key, result, duration);
        ResultLogger.INSTANCE.info(log);
        }
    }
}
