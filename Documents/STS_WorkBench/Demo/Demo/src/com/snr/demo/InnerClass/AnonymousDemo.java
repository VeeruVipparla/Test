package com.snr.demo.InnerClass;

abstract class Person{
	abstract void show();
}

public class AnonymousDemo {

	public static void main(String[] args) {
		Person an=new Person() {
			
			@Override
			void show() {
				System.out.println("Anonymous Example");
				
			}
		};
		
		an.show();

	}

}
