package com.jlc.synchronize;

public class Lab582 {

	public static void main(String[] args) {
		Hello1 h1=new Hello1();
		Hello1 h2=new Hello1();
		MyThread1 th1=new MyThread1(h1);
		MyThread1 th2=new MyThread1(h1);
		th1.start();
		th2.start();
		
	}

}
class MyThread1 extends Thread{
	Hello1 h=null;
	MyThread1(Hello1 h){
		this.h=h;
	}
	public void run() {
		h.show();
	}
	
}
class Hello1{
	 void show() {
		Thread th=Thread.currentThread();
		synchronized (this) {
			
	
		for (int i = 0; i <=5; i++) {
			System.out.println(th.getName()+"show::-"+i+"\t"+this);
			try {
				Thread.sleep(1000);
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}
}
