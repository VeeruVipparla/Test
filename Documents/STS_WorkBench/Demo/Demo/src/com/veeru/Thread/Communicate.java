package com.veeru.Thread;

//this program shows how two threads can communicate with each other.
//this is inefficient way of communication
class Communicate {

	public static void main(String[] args) throws Exception {
		// producer produces some data which consumer consumes
		Producer obj1 = new Producer();
		// pass producer object to consumer so that it is then available to consumer
		Consumer obj2 = new Consumer(obj1);
		// create two threads and attach o producer and consumer
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		// Run the threads

		t1.start();// Consumer waits
		t2.start();// Producer starts production

	}

}

class Producer extends Thread {
	// to add data, we use StringBuffer object
	StringBuffer sb;
	// dataprodover will be true when data production is over
	boolean dataprodover = false;

	Producer() {
		sb = new StringBuffer(); // allot memory
	}

	public void run() {
		// go on appending data (numbers) to string buffer
		for (int i = 1; i <= 10; i++) {
			try {
				sb.append(i + ";");
				Thread.sleep(100);
				System.out.println("appending");
			} catch (Exception e) {
			}

		}
		// data production is over, so store true into dataprodover
		dataprodover = true;

	}
}

class Consumer extends Thread {
	// create producer reference to refer to producer object from consumer class
	Producer prod;

	Consumer(Producer prod) {

		this.prod = prod;
	}

	public void run() {
		// if data production is over, sleep for 10 milliseconds and check

		// again, here there is a time delay of several milliseconds to receive data
		try {
			while (!prod.dataprodover)
				Thread.sleep(10);
		} catch (Exception e) {
		}
		// when data production is over, display data of Stringbuffer
		System.out.println(prod.sb);

	}
}
