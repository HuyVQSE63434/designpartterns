package com.example.strategy.object;

import com.example.strategy.masterInterface.IDuck;
import com.example.strategy.masterInterface.IFlyable;

public class Duck implements IDuck {

    private IFlyable flyable;

    public void setFlyable(IFlyable flyable){
        this.flyable = flyable;
    }

    public Duck(){}

    public Duck(IFlyable flyable){
        this.flyable = flyable;
    }

    @Override
    public void fly() {
        flyable.fly();
    }

    @Override
    public void walk() {
        System.out.println("duck is walking");
        
    }

    @Override
    public void sound() {
        System.out.println("duck is sounding");
    }
    
}
