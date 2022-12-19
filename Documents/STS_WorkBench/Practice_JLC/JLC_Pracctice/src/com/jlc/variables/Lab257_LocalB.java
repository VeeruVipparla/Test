package com.jlc.variables;

public class Lab257_LocalB {

	public static void main(String[] args) {
	int  a=11;
		{
			int a=10;//Duplicate local variable a
			System.out.println("I am local block 1::"+a);
		}
		{
			String str="Final";
			System.out.println("I am local block 2::"+str);
		}
	}

}
