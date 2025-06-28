package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        logger.trace("Trace: entered method X");
        logger.debug("Debug: variable x = {}", 5);
        logger.info("Info: app started");
        logger.warn("Warning: disk space low");
        logger.error("Error: unable to connect to database");

    }
}
