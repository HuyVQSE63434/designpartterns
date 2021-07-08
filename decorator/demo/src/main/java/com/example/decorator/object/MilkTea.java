package com.example.decorator.object;

import com.example.decorator.Iinterface.ImilkTea;

public class MilkTea implements ImilkTea{

    private MilkTeaDecorator milkTeaDecorator;

    public MilkTea(MilkTeaDecorator milkTeaDecorator){
        this.milkTeaDecorator = milkTeaDecorator;
    }

    public MilkTea(){}

    @Override
    public int cost() {
        if(milkTeaDecorator == null){
            return 50;
        }else{
            return 50 + milkTeaDecorator.cost();
        }
    }

    
}
