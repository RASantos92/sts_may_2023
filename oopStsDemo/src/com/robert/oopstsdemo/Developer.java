package com.robert.oopstsdemo;

import java.util.ArrayList;

public class Developer {

    private String name;
    protected int exp;
    private double salary;
    private ArrayList<String> languages;
    private static int devCount;
    private static double totalSalary;
    
    
	public Developer() {
		this.salary = 50000;
		this.languages = new ArrayList<String>();
		Developer.devCount++;
		Developer.totalSalary += this.salary;
	}
	
	public Developer(String name) {
		this.name = name;
		this.salary = 110000;
		this.languages = new ArrayList<String>();
		Developer.devCount++;
		Developer.totalSalary += this.salary;
	}
	
	public Developer(String name,double salary) {
		this.name = name;
		this.salary = salary;
		this.languages = new ArrayList<String>();
		Developer.devCount++;
		Developer.totalSalary += salary;
	}
	
	
	public Developer(String name, int exp, double salary) {
		this.name = name;
		this.exp = exp;
		this.salary = salary;
		this.languages = new ArrayList<String>();
		Developer.devCount++;
		Developer.totalSalary += salary;
	}


    public String displayStatus(){
        String output = "name: " + this.name + "\n";
        output += "exp: " + this.exp + "\n";
        output +="salary: " + this.salary + "\n";
        output += "languages: " + this.languages + "\n";
        return output;
    }


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		Developer.totalSalary -= this.salary;
		this.salary = salary;
		Developer.totalSalary = this.salary;
	}


	public ArrayList<String> getLanguages() {
		return languages;
	}


	public void setLanguages(ArrayList<String> languages) {
		this.languages = languages;
	}


	public static int getDevCount() {
		return devCount;
	}


	public static double getTotalSalary() {
		return totalSalary;
	}
	
	
	

}
