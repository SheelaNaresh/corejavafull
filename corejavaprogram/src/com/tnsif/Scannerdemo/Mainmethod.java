package com.tnsif.Scannerdemo;

import java.util.Scanner;

public class Mainmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.nextLine();
		System.out.println("enter your income");
		int income=sc.nextInt();
		
		Person pp=new Person();
		pp.setName(name);
		pp.setIncome(income);
		
		Taxcal t=new Taxcal();
		t.caltax(pp);
		System.out.println("after cal tax");
		System.out.println(pp);



	}

}
