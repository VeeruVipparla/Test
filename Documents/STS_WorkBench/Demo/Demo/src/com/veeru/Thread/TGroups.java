package com.veeru.Thread;

public class TGroups {

	public static void main(String[] args) throws Exception {
		// we should understand that following statements are executed by
		// the main thread
		Reservation res = new Reservation();
		Cancellation can = new Cancellation();
		// create a thread group with name
		ThreadGroup tg = new ThreadGroup("First group");
		// create two thread groups and add to First group
		Thread t1 = new Thread(tg, res, "First thread");
		Thread t2 = new Thread(tg, res, "Second thread");
		// create another Thread group tg1 as a child to tg
		ThreadGroup tg1 = new ThreadGroup(tg, " Second Group");
		// create two thread groups and add to Second group
		Thread t3 = new Thread(tg1, can, "Third thread");
		Thread t4 = new Thread(tg1, can, "Fourth thread");
		// find the parent group of tg1
		System.out.println("Parent of tg1=" + tg1.getParent());
		// set max priority to tg1 as 7
		tg1.setMaxPriority(7);
		// know the thread group of t1 and t3
		System.out.println("ThraedGroup of t1=" + t1.getThreadGroup());
		System.out.println("ThraedGroup of t3=" + t3.getThreadGroup());
		// start the threads
		t1.start();
		t2.start();
		t3.start();
		t4.start();

		// find how many threads are actively running
		System.out.println("No of threads active in tg= "+ tg.activeCount());

	}

}

class Reservation extends Thread {
	public void run() {
		System.out.println(" Iam reservation thread");

	}
}

class Cancellation extends Thread {
	public void run() {
		System.out.println(" I am Cancellation thread");
	}
}
