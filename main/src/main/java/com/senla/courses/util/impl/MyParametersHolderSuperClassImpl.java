package com.senla.courses.util.impl;

import com.senla.courses.annotation.Component;
import com.senla.courses.util.ParametersHolder;

/**
 * Описание класса
 */
//@Component
public class MyParametersHolderSuperClassImpl implements ParametersHolder {
    public String getSomeText() {
        return "Мой очень крутой текст";
    }
}
