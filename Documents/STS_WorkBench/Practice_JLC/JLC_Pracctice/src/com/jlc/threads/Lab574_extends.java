package com.jlc.threads;

public class Lab574_extends {

	public static void main(String[] args) {
		Mythread t1 = new Mythread();
		Mythread t2 = new Mythread();
		t1.start();
		t2.start();
		//Thread th = new Thread();
		/*
		 * for (int i = 0; i <= 2; i++) { System.out.println(th.getName() + "-value is:"
		 * + i); try { Thread.sleep(1000);
		 * 
		 * } catch (Exception e) { e.printStackTrace(); } }
		 */
	}

}

class Mythread extends Thread {
	public void run() {
		Thread th = new Thread();
		for (int i = 0; i <= 2; i++) {
			System.out.println(th.getName() + "-value is:" + i);
			try {
				Thread.sleep(1000);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}