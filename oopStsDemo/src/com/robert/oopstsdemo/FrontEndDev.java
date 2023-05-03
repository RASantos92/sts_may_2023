package com.robert.oopstsdemo;

public class FrontEndDev extends Developer {

	private boolean isArtistic;
	
	public FrontEndDev() {
		super("Anonymous frontend dev", 100000);
		this.exp = 0;
		this.isArtistic = true;
	}
	
	public FrontEndDev(String name) {
		super(name, 100000);
		this.exp = 0;
		this.isArtistic = true;
	}
	
	public String displayStatus() {
		String output = super.displayStatus();
		output += "is Artistic? " + this.isArtistic;
		return output;
	}
	
	public void giveRaise(double amount) {
		double initalSalary = this.getSalary();
		this.setSalary(initalSalary + amount);
	}
	
}
