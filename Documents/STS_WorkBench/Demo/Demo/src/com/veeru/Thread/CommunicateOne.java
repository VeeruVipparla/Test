package com.veeru.Thread;

public class CommunicateOne {

	public static void main(String[] args) throws Exception {
//producer produces some data which consumer producer obj1 =new producer();
		ProducerOne obj1 = new ProducerOne();
		// pass producer object to consumer so that it is then available to consumer
		ConsumerOne obj2 = new ConsumerOne(obj1);
		// create 2 threads and attach to producer and consumer
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		// Run the threads
		t1.start();
		t2.start();
	}
}

class ProducerOne extends Thread {
	// to add data, we use String buffered object
	StringBuffer sb;

	ProducerOne() {
		sb = new StringBuffer(); // allot memory
	}

	public void run() {

		synchronized (sb) {
			// go on appending data (numbers) to String buffer

			for (int i = 1; i <= 10; i++)

			{
				try {

					sb.append(i + ":");
					Thread.sleep(100);
					System.out.println("appending");
				} catch (Exception e) {
				}

			}
			// data production is over, so notify to consumer thread
			sb.notify();
		}
	}
}

class ConsumerOne extends Thread {
	// create producer reference to refer to producer object from Consumer class
	ProducerOne prod;

	ConsumerOne(ProducerOne prod) {
		this.prod = prod;
	}

	public void run() {
		synchronized (prod.sb) {
			// wait till notification is received from producer thread.Here
			// there is no wastage of time of even a single ,millisecond
			try {
				prod.sb.wait();
			} catch (Exception e) {
			}
			// when data production is over, display data of stringbuffer
			System.out.println(prod.sb);

		}

	}

}
