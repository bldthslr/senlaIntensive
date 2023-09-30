package com.senla.courses.repository.impl;

import com.senla.courses.annotation.Autowire;
import com.senla.courses.annotation.Component;
import com.senla.courses.repository.DatabaseInterface;
import com.senla.courses.util.ParametersHolder;

/**
 * Описание класса
 */
@Component
public class DataBaseInterfaceImpl implements DatabaseInterface {

    @Autowire
    private ParametersHolder parametersHolder;

    public String execute() {
        return parametersHolder.getSomeText();
    }
}
