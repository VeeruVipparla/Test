package com.snr.demo.InnerClass;

interface PersonOne{
	void eat();
}

public class AnonymousIntefaceDemo {

	public static void main(String[] args) {
		PersonOne po=new PersonOne() {
			
			@Override
			public void eat() {
				System.out.println("----eating----");
				
			}
		};
		po.eat();
		

	}


}
