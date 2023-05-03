package com.robert.interfacedemo;

public interface Keepable {
	
	public default void play() {
		System.out.println("Playing...");
	}
	
	// notice how we did not fill in any details for these two functions
    // these are like our contracts. if you use this interface you have to complete these methods
    // abstract : has to completed when the interface is implemented
	abstract void showAffection();
	abstract void askForFood();
	
}
