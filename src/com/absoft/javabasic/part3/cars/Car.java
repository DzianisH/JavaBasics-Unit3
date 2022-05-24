package com.absoft.javabasic.part3.cars;

public abstract class Car {

    public abstract String getCarType();

    public String say() {
        return getCarType() + " says vroom-vroom-vroom";
    }
}
