package com.example.builder.Iinterface;

import com.example.builder.object.Car;
import com.example.builder.object.Wheel;
import com.example.builder.object.Window;

public interface ICarBuilder {
    public ICarBuilder setWindow(Window window);

    public ICarBuilder setWheel(Wheel wheel);
    public Car build();
}
