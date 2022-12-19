package com.veeru.Thread;

import java.io.IOException;

// To create a Thread and run it, then stop it

//
/*class MyThread extends Thread {
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
		}
	}

}

//another class 
class Demo1 {
	public static void main(String[] args) {
		MyThread obj = new MyThread();
		Thread t = new Thread(obj);
		t.start();
	}
}

class Demo {

	public static void main(String[] args) {
		MyThread obj = new MyThread();
		Thread t = new Thread(obj);
		t.start();

	}

}*/

class MyThread implements Runnable {
	boolean stop= false;
	public void run() {

		for (int x =1; x<=100000; x++) {

			System.out.println("X: " + x);
			if (stop) return;
			
		}

	}
}

class Demo {
	public static void main(String[] args) throws IOException{
		MyThread m = new MyThread();
		Thread t = new Thread(m, "veeru");
		t.start();
		System.in.read();
		m.stop= true;
		
	}
}
