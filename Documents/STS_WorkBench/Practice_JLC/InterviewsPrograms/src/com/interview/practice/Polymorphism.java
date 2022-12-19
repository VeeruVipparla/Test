package com.interview.practice;

class Bird{
	public void sing() { 
		System.out.println("Singing");
	}
}
class Parret extends Bird{
	public void sing() {
		System.out.println("KOKOKOKOKO");
	}
}
class Peacock extends Bird{
	public void sing() {
		System.out.println("kahakahakah");
	}
}


public class Polymorphism {

	public static void main(String[] args) {
		Peacock p=new Peacock();
		p.sing();
		p.sing();
		p.sing();

	}

}
