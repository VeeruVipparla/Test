package com.interview.practice;

public class InhertanceEx_1 {

	public static void main(String[] args) {
		BabyDog bd = new BabyDog();
		bd.eat();
		bd.bark();
		bd.weep();

	}
}

class Animal1 {
	void eat() {
		System.out.println("Eating");
	}
}

class Dog1 extends Animal {
	void bark() {
		System.out.println("Barking");
	}
}

class BabyDog extends Dog1 {
	void weep() {
		System.out.println("Weeping");
	}
}
