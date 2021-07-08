package com.example.decorator.object;

import com.example.decorator.Iinterface.ImilkTea;

public class Blacksugar extends MilkTeaDecorator {

    public Blacksugar(ImilkTea milkTea) {
        super(milkTea);
    }

    @Override
    public int cost() {
        return 5 + super.cost();
    }

    
}
