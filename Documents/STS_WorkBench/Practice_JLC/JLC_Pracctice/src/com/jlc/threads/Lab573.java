package com.jlc.threads;

public class Lab573 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		Thread th = new Thread();
		ThreadGroup tg = th.getThreadGroup();
		System.out.println(th.getId() + "\t" + th.getName() + "\t" + th.getPriority() + "\t" + tg.getName());
		for (int i = 0; i < args.length; i++) {
			String str = args[i];
			System.out.println(th.getId() + "\t" + th.getName() + "\t" + tg.getName() + "\t" + str);

		}
		System.out.println("Main Completed");
	}

}
