package com.example.strategy.demo;

import com.example.strategy.behaviour.canFlyable;
import com.example.strategy.behaviour.unFlyable;
import com.example.strategy.masterInterface.IDuck;
import com.example.strategy.object.Duck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		System.out.println("hello world !");

		IDuck duck = new Duck(new canFlyable());

		duck.fly();

		IDuck grassDuck = new Duck(new unFlyable());

		grassDuck.fly();
	}

}
