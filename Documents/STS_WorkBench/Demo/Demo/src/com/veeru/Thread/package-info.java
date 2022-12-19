package com.veeru.Thread;

class Myclass extends Thread {
	public void run() {
		veeru();
		rama();
		raju();
	}

	public void veeru() {
		System.out.println("veeru");
	}

	public void rama() {
		System.out.println("rama");
	}

	public void raju() {
		System.out.println("raju");
	}

}

class TestThread {
	public static void main(String[] args) {
		Myclass m=new Myclass ();
		Thread t= new Thread(m);
		t.start();
	}

	}
