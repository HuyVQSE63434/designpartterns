package com.example.builder.object;

import com.example.builder.Iinterface.ICarBuilder;

public class CarBuilder implements ICarBuilder{

    private Window window;
    private Wheel wheel;

    public CarBuilder(){}

    @Override
    public ICarBuilder setWindow(Window window) {
        this.window = window;
        return this;
    }

    @Override
    public ICarBuilder setWheel(Wheel wheel) {
        this.wheel = wheel;
        return this;
    }

    @Override
    public Car build() {
        return new Car(wheel, window);
    }
    
}
