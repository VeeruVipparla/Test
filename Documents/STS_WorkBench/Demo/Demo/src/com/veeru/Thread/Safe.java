package com.veeru.Thread;
//Thread Synchronization - two threads acting on same subject

class ReserveOne implements Runnable {

	// Available berths are 2
	int available = 2;
	int wanted;

	// accepted wanted berth at run time
	ReserveOne(int i) {
		wanted = i;

	}

	public void run() {
		synchronized (this) // synchronized the current object
		{
			// display available berths
			System.out.println(" Avialable Berths= " + available);
			// if available berths are more than wanted berths

			if (available >= wanted) {
				// get the name passenger
				String name = Thread.currentThread().getName();
				// a lot the berth to him
				System.out.println(wanted + " Berths reserved for " + name);
				try {
					Thread.sleep(1500); // wait for printing the jacket
					available = available - wanted;
					// update the no.of available berths
				} catch (InterruptedException ie) {
				}

			}
			// if the available berths are less, display sorry
			else
				System.out.println("Sorry, no berths");
		} // end of synchronized block

	}
}

class Safe {
	public static void main(String[] args) {
		// tell that 1 berth is needed
		ReserveOne obj = new ReserveOne(1);
		// attach first thread to the object
		Thread t1 = new Thread(obj);
		// attach second thread to the same object
		Thread t2 = new Thread(obj);
		Thread t3= new Thread(obj);

		// take the thread names as person names
		t1.setName("first person");
		t2.setName("second person");
		t3.setName("Third person");
		// send the request for berth
		t1.start();
		t2.start();
		t3.start();
	}
}
