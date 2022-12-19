package com.jlc.threads;

import sun.security.krb5.internal.TGSRep;

class MyThread1 implements Runnable {

	public void run() {
		Thread t = Thread.currentThread();
		ThreadGroup tg=t.getThreadGroup();

		for (int i = 0; i <= 2; i++) {

			System.out.println(t.getName() + "\t" + i+"\t"+tg.getName());
		}

	}
}

public class Lab575_Runnable {
	public static void main(String[] args) {
		ThreadGroup tg=new ThreadGroup("Hello");
		MyThread1 mt = new MyThread1();
		Thread t = new Thread(tg,mt,"veeru");
		Thread t1=new Thread(mt);
		t.start();
		t1.start();

	}

}
