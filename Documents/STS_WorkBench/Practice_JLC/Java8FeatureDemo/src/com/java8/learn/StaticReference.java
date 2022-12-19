package com.java8.learn;

//@FunctionalInterface
interface ShowInterface{
	void say();
	
	
}

public class StaticReference {
	
	public StaticReference() {
		System.out.println("===Constractor Reference===");
	}
	
	public static void showStaticreference() {
		System.out.println("===Show Static Reference===");
		
	}
	
	public  void showReference() {
		System.out.println("===Show Non-Static/Instance  Method Reference===");
		
	}

	public static void main(String[] args) {
		
		//StaticReference.showStaticreference();//java7
		
		
		ShowInterface si=StaticReference::showStaticreference;
		si.say();
		
		StaticReference sr=new StaticReference();
		
		
	
	}

}
