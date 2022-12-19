package com.snr.demo.test;

class Animal1{
	void eat(){
		System.out.println("eating");
	}
}
class dog extends Animal1{
	void bark(){
		System.out.println("barking");
	}
}
class Single_inheratance{
	public static void main(String[] args) {
		dog d=new dog();
		d.bark();
		d.eat();
	}
}


