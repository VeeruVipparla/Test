package com.jlc.date;

import java.util.Timer;
import java.util.TimerTask;

public class Lab680 {
	public static void main(String[] args) {
		System.out.println("About to schedule task");
		new Reminder(5);
		System.out.println("Task scheduled");
	}
}

class Reminder {
	Timer timer;

	Reminder(int seconds) {
		timer = new Timer();
		timer.schedule(new RemindTask(), seconds * 1000);
	}

	public class RemindTask extends TimerTask {
		@Override
		public void run() {
			System.out.println("Time's up!");
			timer.cancel();
		}
	}
}
