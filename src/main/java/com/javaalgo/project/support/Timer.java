package com.javaalgo.project.support;

import com.javaalgo.project.search.Searchable;

public class Timer {
    Searchable searchable;

    public Timer(Searchable searchable) {
        this.searchable = searchable;
    }

    public void timeSearch(int key) {
        long startTime = System.nanoTime();
        int result = searchable.search(key);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Search for: " + result + " in " + duration + " nanoseconds.");
    }
}
