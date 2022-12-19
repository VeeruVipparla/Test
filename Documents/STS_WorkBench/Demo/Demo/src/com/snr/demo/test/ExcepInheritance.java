package com.snr.demo.test;


 class AA{
	
	void display() throws NullPointerException{
		System.out.println("Super class display");
	}
	
}
class BB extends AA{
	
	void display() throws Exception{
		System.out.println("sub class display");
	}
	
}
public class ExcepInheritance {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
