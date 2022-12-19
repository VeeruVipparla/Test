package com.jlc.threads;

public class Lab580 {

	public static void main(String[] args) {
		Account acc = new Account();
		new AccountThread(acc);

	}

}

class Account {
	int bal = 970;

	public synchronized void withDraw(int amt) {
		if (bal >= amt) {
			System.out.println(Thread.currentThread().getName() + "is going to Withdraw...." + bal);
			try {
				Thread.sleep(1500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			bal -= amt;
			System.out.println(Thread.currentThread().getName() + "Complete withdraw..." + bal);

		}
	}

	public int getBal() {
		return bal;

	}
}

class AccountThread implements Runnable {
	Account acc = null;

	AccountThread(Account acc) {
		this.acc = acc;
		Thread t1 = new Thread(this,"A");
		Thread t2 = new Thread(this,"B");
		t1.start();
		t2.start();

	}

  	public void run() {
		for (int i = 0; i < 5; i++) {
			acc.withDraw(225);
			if (acc.getBal() < 0) {
				System.out.println("Amount is overDrawn");
			}

		}

	}

}