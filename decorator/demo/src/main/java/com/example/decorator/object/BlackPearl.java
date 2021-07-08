package com.example.decorator.object;

import com.example.decorator.Iinterface.ImilkTea;

public class BlackPearl extends MilkTeaDecorator{

    public BlackPearl(ImilkTea milkTea) {
        super(milkTea);
    }

    @Override
    public int cost() {
        return 3 + super.cost();
    }

    
}
