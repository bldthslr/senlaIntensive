package com.senla.courses;

import com.senla.courses.api.Starter;
import com.senla.courses.controller.ControllerInterface;
import com.senla.courses.injection.AppContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Main {
    private static final Logger logger = LogManager.getRootLogger();

    public static void main(String[] args) {

        // Проверка архитектуры
        logger.warn("Program starts. This is warn message.");

        AppContext applicationContext = Starter.run(List.of("com.senla.courses.controller", "com.senla.courses.service",
                "com.senla.courses.repository", "com.senla.courses.util"));

        logger.info("Context have been Created");

        ControllerInterface controllerInterface = applicationContext.getObject(ControllerInterface.class);

        logger.info("Controller interface was extracted");

        controllerInterface.start();

        logger.error("GOOD JOB!!!");
    }
}
