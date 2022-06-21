package com.javaalgo.project.search;

import com.javaalgo.project.support.Timable;

/**
 * Base class for all search algorithms.
 *
 * @author Tobias Hansson
 */
public abstract class BaseSearcher implements Timable {
    protected int[] array;
    protected int key;

    /**
     * Constructor for BaseSearcher.
     *
     * @param array the array to be searched.
     * @param key   the key to be searched for.
     */
    protected BaseSearcher(final int[] array, final int key) {
        this.array = array;
        this.key = key;
    }

    /**
     * Set the array to be searched.
     *
     * @param array the array to be searched.
     */
    public void setArray(int[] array) {
        this.array = array;
    }

    /**
     * Set the key to be searched for.
     *
     * @param key the key to be searched for.
     */
    public void setKey(int key) {
        this.key = key;
    }
}
