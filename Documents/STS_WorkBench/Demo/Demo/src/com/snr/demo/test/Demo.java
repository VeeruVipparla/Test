package com.snr.demo.test;

class Animal{
	void eat() {
		System.out.println("eating");
	}
	}
class Dog extends Animal{
	void bark() {
		System.out.println("barking");
	}
}
class Cat extends Dog{
	void meow() {
		System.out.println("meowing");
	}
	
}
class Demo{
	public static void main(String[] args) {
		Cat c=new Cat();
		Dog d=new Dog();
		c.eat();
		c.meow();
		d.bark();
		

	
	}
}




