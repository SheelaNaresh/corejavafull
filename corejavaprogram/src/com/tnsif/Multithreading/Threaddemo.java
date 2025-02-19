package com.tnsif.Multithreading;

class eclipse extends Thread{
	
	public void run() {
		System.out.println("eclipse "+Thread.currentThread().getId());   //2nd step
	}
	
}
class notepad extends Thread{
	public void run() {
		System.out.println("notepad "+Thread.currentThread().getId());   //2nd step
	}
}

class chrome extends Thread{
	public void run() {
		System.out.println("chrome "+Thread.currentThread().getId());   //2nd step
	}
}

public class Threaddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("mainthread "+Thread.currentThread().getId()); 
		
		eclipse e=new eclipse();
		e.start();//1st step
		
		notepad f=new notepad();
		f.start();
		
		chrome g=new chrome();
		g.start();
	}
	}
		
		
		
