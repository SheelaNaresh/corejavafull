package com.tnsif.interfacE;

public class Demointerface implements Childinterface,Parentinterface {
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("ready to print");
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("ready to show");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demointerface d=new Demointerface();
		d.show();
		d.print();
		
		

	}

	

}
