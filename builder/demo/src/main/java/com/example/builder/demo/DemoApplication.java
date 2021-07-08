package com.example.builder.demo;

import com.example.builder.Iinterface.ICarBuilder;
import com.example.builder.object.Car;
import com.example.builder.object.CarBuilder;
import com.example.builder.object.Wheel;
import com.example.builder.object.Window;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ICarBuilder carBuilder = new CarBuilder()
		.setWheel(new Wheel())
		.setWindow(new Window());

		Car car = carBuilder.build();
		car.print();
	}

}
