package com.example.builder.object;

import com.example.builder.Iinterface.IComponent;

public class Car implements IComponent{
    private Wheel wheel;
    private Window window;

    public Wheel getWheel() {
        return this.wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Window getWindow() {
        return this.window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public Car(){}

    public Car(Wheel wheel, Window window){
        this.wheel = wheel;
        this.window = window;
    }

    @Override
    public void print() {
        System.out.println("this is car:");
        wheel.print();
        window.print();
        
    }
    
}
