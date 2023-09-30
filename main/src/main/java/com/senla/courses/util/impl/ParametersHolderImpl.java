package com.senla.courses.util.impl;

import com.senla.courses.annotation.Component;
import com.senla.courses.annotation.Value;
import com.senla.courses.util.ParametersHolder;

/**
 * Описание класса
 */
@Component
public class ParametersHolderImpl implements ParametersHolder {

    @Value(property = "property1")
    private String text;

    public String getSomeText() {
        return text;
    }
}
