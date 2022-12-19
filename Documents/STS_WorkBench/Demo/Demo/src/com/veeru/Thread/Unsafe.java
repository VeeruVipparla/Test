package com.veeru.Thread;

//  Two threads acting on single object
class Reserve implements Runnable {
	int available = 1; // available berth is one
	int wanted;

// accept wanted berths at run time
	Reserve(int i)

	{
		wanted = i;
	}

	public void run() {
		// display available berths
		System.out.println(" Available Berths = " + available);
		// if available berths are more than the wanted berths
		if (available >= wanted) {
			// get the name passenger
			String name = Thread.currentThread().getName();
			// a lot the berth to him
			System.out.println(wanted + " berths reserve for " + name);
			try {
				Thread.sleep(1500); // wait for printing ticket
				available = available - wanted;
				// update the number of available berths
			} catch (InterruptedException ie) {
			}
		}
		// if available berths are less, display sorry
		else
			System.out.println("Sorry no berths");
	}
}

public class Unsafe {

	public static void main(String[] args) {
// tell that 1 berth is needed
		Reserve obj = new Reserve(1);
// attach first thread to the object
		Thread t1 = new Thread(obj);
// attach second thread to the same object
		Thread t2 = new Thread(obj);
	//	Thread t3 = new Thread(obj);
// attach Third thread to the same object
		//Thread t3 = new Thread(obj);
// take the thread names person names
		t1.setName("First person");
		t2.setName("Second person");
		//t3.setName("Third person");
//second the requests for berth
		t1.start();
		t2.start();
	//	t3.start();
	}

}
