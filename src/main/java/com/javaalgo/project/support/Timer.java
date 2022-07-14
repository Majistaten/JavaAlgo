package com.javaalgo.project.support;

import static java.time.format.DateTimeFormatter.ofPattern;

/**
 * Timer class that wraps a Timable object and provides a simple interface for timing the execution of the algorithm.
 */
public class Timer {
    Timable searcher;
    boolean logging;

    /**
     * Constructor for Timer.
     *
     * @param searcher the algorithm object to be timed.
     */
    public Timer(Timable searcher, boolean logging) {
        this.searcher = searcher;
        this.logging = logging;
    }

    /**
     * Time the execution of the algorithm and log the result
     */
    public void timeSearch() {
        long startTime = System.nanoTime();
        int[] result = searcher.execute();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        if (logging) {
            logResults(result, duration);
        }
    }

    private void logResults(int[] result, long duration) {
        String log = String.format("%s %-20s key:%-5s at:%-5s in %s nanoseconds.", java.time.LocalDateTime.now().format(ofPattern("HH:mm:ss")),
                searcher.getClass().getSimpleName(), result[0], result[1], duration);
        ResultLogger.INSTANCE.info(log);
    }

    public void setSearcher(Timable searcher) {
        this.searcher = searcher;
    }
}
