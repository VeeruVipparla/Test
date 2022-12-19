package com.snr.demo.InnerClass;
 
class LocalInner1{
	private int data=10;//instance variable 
	
	
	
	
	void display() {
		class Local{
			void message() {
				System.out.println(data);
			}
		}
		
		 Local local=new Local();
		 local.message();
		 }

 
 
 }

public class AnonymousLocalDemo {

	public static void main(String[] args) {
		LocalInner1 localInner=new LocalInner1();
		localInner.display();

	}

}
