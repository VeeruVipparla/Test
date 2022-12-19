package com.veeru.Thread;

// Thread Priorities
class MyclassOne extends Thread {
	int count = 0; // this counts numbers

	public void run() {
		
		for (int i = 1; i <= 10; i++)
			count++; // count numbers upto 1000
		// display the which thread has completed counting and its priority
		System.out.println("Completed thread:" + Thread.currentThread().getName());
		System.out.println("Its priority:" + Thread.currentThread().getPriority());

	}

}

public class Prior {

	public static void main(String[] args) {
		MyclassOne obj = new MyclassOne();
		// create two threads
		Thread t1 = new Thread(obj, "Two");
		Thread t2 = new Thread(obj, "One");
		// set priorities for them
		t1.setPriority(2);
		t2.setPriority(Thread.MAX_PRIORITY); // this means priority no.5
		// start first t1 and the t2
		t1.start();
		t2.start();

	}

}
