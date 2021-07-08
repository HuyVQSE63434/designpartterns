package com.example.decorator.object;
import com.example.decorator.Iinterface.ImilkTea;

public class MilkTeaDecorator implements ImilkTea{

    private ImilkTea milkTea;

    public MilkTeaDecorator(ImilkTea milkTea){
        this.milkTea = milkTea;
    }

    @Override
    public int cost() {
        return milkTea.cost();
    }

}
