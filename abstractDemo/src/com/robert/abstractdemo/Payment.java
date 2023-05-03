package com.robert.abstractdemo;

public abstract class Payment {
	
	private double amount;

	public Payment(double amount) {
		this.amount = amount;
	}
	
	public void paymentDetails() {
		System.out.println("Payment amount: " + this.getAmount());
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
