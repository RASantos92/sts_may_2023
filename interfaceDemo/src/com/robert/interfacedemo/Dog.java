package com.robert.interfacedemo;

public class Dog extends Pet implements Keepable {
	
	public Dog() {}
	
	public Dog(String name) {
		super(name, "dog");
	}

	@Override
	public void showAffection() {
		System.out.println("Puppy eyes, Tail wag, lays on ya");
		
	}

	@Override
	public void askForFood() {
		System.out.println("Barking, howles");
		
	}

}
