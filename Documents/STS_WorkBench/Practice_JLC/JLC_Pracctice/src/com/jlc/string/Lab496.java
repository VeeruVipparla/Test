package com.jlc.string;

public class Lab496 {

	public static void main(String[] args) {
		String str="Veeru vipparla Software Training Center";
		String res[]=str.split("Veeru",1);
		System.out.println("Length::"+res.length);
		for (int i = 0; i < res.length; i++) {
			String st=res[i];
			System.out.println(i+"\t"+st);
		}
		String res1[]=str.split("Veeru",2);
		System.out.println("Length::"+res1.length);
		for (int i = 0; i < res1.length; i++) {
			String st=res1[i];
			System.out.println(i+"\t"+st);
		}
	} 

}
