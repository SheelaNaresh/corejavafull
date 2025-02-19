package com.tnsif.Multithreading;

class star implements Runnable{
	
	public void run() {
		System.out.println("star "+Thread.currentThread().getId());   //2nd step
	}
	
}

class flipcart implements Runnable{
	
	public void run() {
		System.out.println("flipcart "+Thread.currentThread().getId());   //2nd step
	}
	
}

public class Runnableinterface {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		star e=new star();
		Thread ob=new Thread(e);
		ob.start();//1st step

		
		flipcart f=new flipcart();
		Thread ob1=new Thread(f);
		ob1.start();//1st step
	}

}
