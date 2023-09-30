package com.senla.courses.controller.impl;

import com.senla.courses.annotation.Autowire;
import com.senla.courses.annotation.Component;
import com.senla.courses.annotation.PostConstruct;
import com.senla.courses.controller.ControllerInterface;
import com.senla.courses.service.ServiceInterface;

/**
 * Описание класса
 */
@Component
public class ControllerInterfaceImpl implements ControllerInterface {

    @Autowire
    private ServiceInterface serviceInterface;
    private String appender;

    @PostConstruct
    public void init() {
        appender = " Awesome!";
    }

    public void start() {
        System.out.println(serviceInterface.execute() + appender);
    }
}
