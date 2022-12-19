package com.jlc.threads;

public class Lab578 {

	public static void main(String[] args) {
	Mythread2 mt=new Mythread2();
	//mt.setPriority(10);
	//mt.setPriority(11);
	mt.setPriority(1);
	System.out.println(mt);

	}

}
class Mythread2 extends Thread{
	
}