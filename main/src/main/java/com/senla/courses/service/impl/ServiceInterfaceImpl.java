package com.senla.courses.service.impl;

import com.senla.courses.annotation.Autowire;
import com.senla.courses.annotation.Component;
import com.senla.courses.repository.DatabaseInterface;
import com.senla.courses.service.ServiceInterface;

/**
 * Описание класса
 */
@Component
public class ServiceInterfaceImpl implements ServiceInterface {

    @Autowire
    private DatabaseInterface databaseInterface;

    public String execute() {
        return databaseInterface.execute();
    }
}
