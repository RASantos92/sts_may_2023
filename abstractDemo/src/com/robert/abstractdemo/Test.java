package com.robert.abstractdemo;

public class Test {

	public static void main(String[] args) {
		CashPayment laptop = new CashPayment(1200);
		laptop.paymentDetails();
		
		System.out.println("**************************\n");
		
		CreditCardPayment tacos = new CreditCardPayment(20,"456456", "robert" , "05/3");
		tacos.paymentDetails();

	}

}
