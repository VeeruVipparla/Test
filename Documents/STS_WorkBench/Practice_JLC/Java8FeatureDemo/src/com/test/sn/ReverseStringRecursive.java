package com.test.sn;

public class ReverseStringRecursive {
	
	private static String showRecursive(String name) {
		if((name==null) || (name.length()<=1 ) ) {
			return name;
		}
		return showRecursive(name.substring(1)+name.charAt(0));
		 
	}

	public static void main(String[] args) {
		
		System.out.println("==============");
		//ReverseStringRecursive r=new ReverseStringRecursive();
		//System.out.println(r.showRecursive("SNRaju"));
		System.out.println(showRecursive("MyJava"));

	}

}
