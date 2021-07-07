package com.example.strategy.behaviour;

import com.example.strategy.masterInterface.IFlyable;

public class unFlyable implements IFlyable {

    @Override
    public void fly() {
        System.out.println("duck is can not fly");
        
    }
    
}
