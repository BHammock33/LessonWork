package com.week7.lesson2;

public class GenericFactoryApplication {

	public static void main(String[] args) {

		GenericFactory carFactory = new CarFactory();
		Body body = new Body();
		Frame frame = new Frame();
		Electronics electronics = new Electronics();

		Part[] parts = new Part[3];
		parts[0] = body;
		parts[1] = frame;
		parts[2] = electronics;

		Product car = carFactory.build(parts);
		System.out.println("We built a new car: " + car);
	}

}
// interfaces are implemented not instantiated 
// abstract classes must define at least one abstract method
// non abstract methods have a defined body
// interface defines a contract an abstract class is looser 
// use abstract classes when you have a lot of similar but slightly different objects
// interfaces are good for making people use the methods where the objects are very different 