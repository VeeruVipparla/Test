package com.jlc.threads;

public class Lab579_Deadlock {

	public static void main(String[] args) throws Exception {
		MyThread3 th=new MyThread3("veeru");
		Thread t1=new Thread(th);
		System.out.println(t1.getState());
		t1.start();
		Thread.sleep(1000);
		System.out.println(t1.getState());
		Thread.sleep(500);
		System.out.println(t1.getState());
		System.out.println(t1.getState());
	}
	

}
class MyThread3 extends Thread{
	MyThread3(String str) {
		super(str);
	}
	public void run() {
		Thread th=Thread.currentThread();
		for (int i = 0; i <=5; i++) {
			System.out.println(getName()+"\t"+"value is :"+i+"\t"+th.getState());
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}