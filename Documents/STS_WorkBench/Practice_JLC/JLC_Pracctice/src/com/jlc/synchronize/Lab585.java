package com.jlc.synchronize;

import java.util.ArrayList;

public class Lab585 {
	public static void main(String[] args) {
		Hai h1 = new Hai();
		Mythread4 th = new Mythread4(h1);
		Mythread4 th1 = new Mythread4(h1);
		th.start();
		th1.start();

	}

}

class Mythread4 extends Thread {
	Hai h;

	Mythread4(Hai h) {
		this.h = h;
	}

	public void run() {
		h.show();
	}
}

class Hai {
	synchronized void show() {
		//ArrayList al = new ArrayList<>();
		Thread t = Thread.currentThread();
	//	synchronized (al) {
			for (int i = 0; i <= 5; i++) {
				try {
					wait(1000);
					// al.wait(1000);
					// Thread.sleep(1000);
					System.out.println(t.getName() + "Show::" + "\t" + this);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	 }
//}