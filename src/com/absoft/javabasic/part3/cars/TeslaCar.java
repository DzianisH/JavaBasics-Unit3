package com.absoft.javabasic.part3.cars;

public class TeslaCar extends Car {
    @Override
    public String getCarType() {
        return "Tesla car";
    }

    @Override
    public String say() {
        return "I'm Tesla electrical car, and I moves silently like a ninja";
    }
}
