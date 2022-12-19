package com.snr.demo.InnerClass;

class TestOuter{
static int data=10;
	
	static class StaticClass{
		static void show() {
			System.out.println("show method "+data);
		}
		
	}

	
}

public class StaticAnonymousDemo {
	
	static int data=10;
	
	static class StaticClass{
		static void show() {
			System.out.println("show method "+data);
		}
		
	}

	public static void main(String[] args) {
		StaticAnonymousDemo.StaticClass obj= new StaticAnonymousDemo.StaticClass();
		obj.show();
		
		TestOuter.StaticClass.show();
	}


}
