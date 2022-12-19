package com.veeru.Thread;
// Two threads performing two tasks at s time - theater example

class MyThreadOne implements Runnable {
	String str;

	MyThreadOne(String str) {
		this.str = str;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(str + " : " + i);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();

			}

		} // end of for

	}// end run
}

class Theater {

	public static void main(String[] args) {
		MyThreadOne s1 = new MyThreadOne("cut the ticket");
		MyThreadOne s2 = new MyThreadOne("show the seat");

		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);

		t1.start();
		t2.start();

	}

}
