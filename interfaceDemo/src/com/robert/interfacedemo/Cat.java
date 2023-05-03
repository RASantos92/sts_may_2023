package com.robert.interfacedemo;

public class Cat extends Pet implements Keepable{

	public Cat() {
		super("random cat name", "cat");
	}
	
	public Cat(String name) {
		super(name, "cat");
	}

	@Override
	public void showAffection() {
		System.out.println("Meow..., purrrr");
		
	}

	@Override
	public void askForFood() {
		System.out.println("Meow but louder");
		
	}

}
