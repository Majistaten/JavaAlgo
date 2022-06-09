package com.javaalgo.project.support;

import java.io.IOException;
import java.util.logging.*;

public class ResultLogger {

    public static final Logger INSTANCE;

    static {

        // Getting the logger
        INSTANCE = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        INSTANCE.setUseParentHandlers(false);

        // Creating the formatter
        SimpleFormatter formatter = new SimpleFormatter() {
            @Override
            public String format(final LogRecord record) {
                return String.format("%s%n", record.getMessage());
            }
        };
        // Completing the file handler.
        try {
            FileHandler fileHandler = new FileHandler("src/main/resources/logging.log");
            fileHandler.setFormatter(formatter);
            INSTANCE.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
