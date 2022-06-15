package com.javaalgo.project.support;

import static java.time.format.DateTimeFormatter.ofPattern;

public class Timer {
    Timeable searcher;

    public Timer(Timeable searcher) {
        this.searcher = searcher;
    }

    public void timeSearch(int key) {
        long startTime = System.nanoTime();
        int[] result = searcher.execute();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        // TODO: Remove logging from timer and return the result instead.
        String log = String.format("%s %-20s key:%-5s at:%-5s in %s nanoseconds.", java.time.LocalDateTime.now().format(ofPattern("HH:mm:ss")),
                searcher.getClass().getSimpleName(), result[0], result[1], duration);
        ResultLogger.INSTANCE.info(log);
    }
}
