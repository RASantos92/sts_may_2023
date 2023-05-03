package com.robert.interfacedemo;

public class Test {

	public static void main(String[] args) {
		Cat cat1 = new Cat("winston");
		cat1.play();
		cat1.showAffection();
		cat1.askForFood();
		
		System.out.println("********************************\n");
		Dog dog1 = new Dog("Winston");
		dog1.play();
		dog1.showAffection();
		dog1.askForFood();

	}

}
