package com.java8.learn;


interface Messageable{
Message getMessage(String msg);
}


public class Message {
	
	String str;
	
	public Message(String str) {
		System.out.println("Constrator parameter value :: "+str);
		this.str=str;
	}
	
	

	public static void main(String[] args) {
		
		Messageable m=Message::new;
		m.getMessage("Hello Veeru");
		
		
	}

}
