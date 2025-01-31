package com.tnsif.constructor;

public class Customer {
	
	private String name;
	private int roll;
	private String address;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	Customer(String name,int roll,String address)
	{
		this.name=name;
		this.roll=roll;
		this.address=address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", roll=" + roll + ", address=" + address + "]";
	}
	
}
