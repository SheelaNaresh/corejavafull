package com.tnsif.constructor;

import java.util.Scanner;

public class Customerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.nextLine();
		System.out.println("enter your roll");
		int roll=sc.nextInt();
		System.out.println("enter your address");
		String address=sc.next();
		
		Customer c=new Customer();
		
		c.setName(name);
		c.setRoll(roll);
		c.setAddress(address);
		
		System.out.println(c);
		
		boolean output= c instanceof Customer;
		System.out.println(output);
			


		
	}

}
