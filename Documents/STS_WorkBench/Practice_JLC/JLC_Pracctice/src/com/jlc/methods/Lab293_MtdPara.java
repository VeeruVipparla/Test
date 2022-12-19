package com.jlc.methods;

public class Lab293_MtdPara {

	public static void main(String[] args) {
		Hello2 h=new Hello2();
//		System.out.println(h.show(10));
		h.show('A');
		h.show((char)65);
		
	}

}
class Hello2{
	int show (int x) {
		System.out.println("show()");
		return x+1;
		
	}
	char show(char b) {
		System.out.println("show (char)");
		return b;
	}
}