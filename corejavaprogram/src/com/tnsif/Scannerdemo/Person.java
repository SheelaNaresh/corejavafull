package com.tnsif.Scannerdemo;

public class Person {
	private String Name;
	private int income;
	private int tax;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", income=" + income + ", tax=" + tax + "]";
	}
	
	
}
