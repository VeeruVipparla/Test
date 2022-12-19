package com.veeru.Thread;


// Thread Deadlock
class BookTicket extends Thread
{
	// we are assuming train, compartment take as object
	Object train, comp;

	BookTicket(Object train, Object comp) {
		this.train = train;
		this.comp = comp;
	}

	public void run() {
		// lock on train
		synchronized (train) {
			System.out.println("Book the ticket lock the train");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}

			System.out.println("BookTicket now waiting to lock on to compartment... ");
			synchronized (comp) {
				System.out.println("BookTicket locked on compartment");
			}
		}
	}
}

	class CancelTicket extends Thread 
	{
		// we are assuming train, compartment take as object
		Object train, comp;

		CancelTicket(Object train, Object comp) 
		{
			this.train = train;
			this.comp = comp;
		}

		public void run() 
		{
			// lock on compartment
			synchronized (comp) 
			{
				System.out.println("Cancle the ticket lock the train");
				try {
					Thread.sleep(1500);
				} catch (InterruptedException ie) {}
				
				System.out.println("CancelTicket now waiting to lock on to compartment... ");
				synchronized (train) {
					System.out.println("CancelTicket locked on train");
				}
			}
		}
	}
	


 class Deadlock {
	public static void main(String[] args) throws Exception {
		Object train = new Object();
		Object compartment = new Object();
		BookTicket obj1 = new BookTicket(train, compartment);
		CancelTicket obj2 = new CancelTicket(train, compartment);
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();

	}
 }

