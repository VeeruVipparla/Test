package com.jlc.basic;

public class Hello1 {

	
		char ch;
		void show() {
			System.out.println(ch == 0);
			System.out.println(ch == '');//Invalid character constant
			System.out.println(ch=='\u0000');
			
		}
}


class Lab2{
	public static void main(String[] args) {
		Hello1 h=new Hello1();
		h.show();
	}
}



