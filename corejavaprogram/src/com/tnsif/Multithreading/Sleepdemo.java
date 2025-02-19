package com.tnsif.Multithreading;

class ecl extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("eclipse "+Thread.currentThread().getId());   //2nd step
		try {
		sleep(2000);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		}
	}
	
}

//class not extends Thread{
//	public void run() {
//		for(int i=0;i<5;i++) {
//			System.out.println("eclipse "+Thread.currentThread().getId());   //2nd step
//			try {
//			sleep(2000);
//			}
//			catch(Exception e) {
//				System.out.println(e.getMessage());
//			}
//			}
//	}
//		
//}


public class Sleepdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ecl e=new ecl();
		e.start();//1st step
		
//		note f=new note();
//		f.start();

	}

}
