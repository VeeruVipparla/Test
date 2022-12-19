package com.interview.practice;

public class InhertanceEx {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.Bark();
		d.eat();
	}
}
class Animal{
	int i;
	void eat() {
		System.out.println("eating");
	}
}
class Dog extends Animal {
	int j;
	void Bark() {
		System.out.println("Barking");
		
	}
}
