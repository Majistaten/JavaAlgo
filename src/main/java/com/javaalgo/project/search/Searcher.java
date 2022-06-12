package com.javaalgo.project.search;

import com.javaalgo.project.support.Timable;

public abstract class Searcher implements Timable {
    int[] array;
    int key;

    public Searcher(final int[] array, final int key) {
        this.array = array;
        this.key = key;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
