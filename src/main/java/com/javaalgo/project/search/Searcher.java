package com.javaalgo.project.search;

public abstract class Searcher {
    int[] array;

    public Searcher(int[] array) {
        this.array = array;
    }

    public abstract int search(int key);

    public void setArray(int[] array) {
        this.array = array;
    }
}
