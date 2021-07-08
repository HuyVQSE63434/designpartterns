package com.example.decorator.demo;

import com.example.decorator.object.BlackPearl;
import com.example.decorator.object.Blacksugar;
import com.example.decorator.object.MilkTea;
import com.example.decorator.object.MilkTeaDecorator;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		MilkTeaDecorator menu1 = new BlackPearl(new Blacksugar(new MilkTea()));

		System.out.println(menu1.cost());

		MilkTeaDecorator menu2 = new Blacksugar(new MilkTea());

		System.out.println(menu2.cost());
	}

}
