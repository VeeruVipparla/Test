package com.jlc.synchronize;

public class Lab588 {

	public static void main(String[] args) {
		Service s=new Service();
		s.start();
		for(char ch='A';ch<='J';ch++) {
			System.out.println("Main Running:"+ch);
			try {
				Thread.sleep(500);
			}
		}
	}

}
class Service extends Thread{
	 public void run() {
		for (int i=0; i<=5; i++) {
			System.out.println("Service Running:"+i);
			if (i==5) {
				int x=10/0;
			}
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}