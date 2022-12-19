package com.snr.demo.test;



interface DemoInterface{
	 
public static final String NAME="Veeru";
static int b=10;
int c=5;


public abstract String display();// abstract method

public void show();// public method.


void action(); // default java 1.8v

}

class TestInterfaceDemo implements DemoInterface{

	@Override
	public String display() {
		
		System.out.println("display "+NAME);
		return NAME;
	}

	@Override
	public void show() {
		System.out.println("show ");
		
	}

	@Override
	public void action() {
		System.out.println("action ");
		
	}
	
}

public class IntefaceDemo {

	public static void main(String[] args) {
		
		DemoInterface d;
		d=new TestInterfaceDemo();
		d.display();
		d.show();
		d.action();

	}

}
