package com.jlc.threads;

class Myclass extends Thread {

	Myclass(String str) {
		super(str);
	}

	 public void run() {
		for (int i = 0; i <= 3; i++) {
			
			System.out.println(" Thread name is:: " + getName() + "->" + " value: " + i+"\t"+"Priority :-"+getId());
			System.out.println();
		}
	}
}

public class Test {
	public static void main(String[] args) {
		Myclass m = new Myclass("veeru");
		Thread t = new Thread(m);
		t.start();

	}
}
