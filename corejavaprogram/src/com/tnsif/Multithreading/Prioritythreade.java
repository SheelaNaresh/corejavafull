package com.tnsif.Multithreading;

class ecli extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++)
		System.out.println("eclipse "+Thread.currentThread().getId());   //2nd step
	}
	
}
class note extends Thread{
	public void run() {
		for(int i=0;i<5;i++)
		System.out.println("notepad "+Thread.currentThread().getId());   //2nd step
	}
}

public class Prioritythreade {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ecli e=new ecli();
		e.start();//1st step
		e.setPriority(Thread.MAX_PRIORITY);//but it is not working because it is based on jvm only still
		
		note f=new note();
		f.start();
		e.setPriority(Thread.MIN_PRIORITY);
		
		for(int i=0;i<5;i++)
		System.out.println("main merhod"+Thread.currentThread().getId());
		

	}

}
