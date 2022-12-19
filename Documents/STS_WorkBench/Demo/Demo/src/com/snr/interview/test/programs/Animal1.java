package com.snr.interview.test.programs;

public class Animal1 {
void eat() {
	System.out.println("walking");
}
}
class Dog1 extends Animal{
	void bark() {
		System.out.println("Byting");
	}
}
class BabyDog extends Dog{
	void weep() {
		System.out.println("Shouting");
	}
}
class Test1 {
	public static void main(String[] args) {
		BabyDog bd= new BabyDog();
		bd.bark();
		bd.eat();
		bd.weep();
	}
}