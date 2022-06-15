package com.javaalgo.project.search;

import com.javaalgo.project.support.Timeable;

public abstract class BaseSearcher implements Timeable {
    protected int[] array;
    protected int key;

    protected BaseSearcher(final int[] array, final int key) {
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
