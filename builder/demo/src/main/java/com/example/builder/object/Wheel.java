package com.example.builder.object;

import com.example.builder.Iinterface.IComponent;

public class Wheel implements IComponent{

    @Override
    public void print() {
        System.out.println("this is wheel");
        
    }
    
}
