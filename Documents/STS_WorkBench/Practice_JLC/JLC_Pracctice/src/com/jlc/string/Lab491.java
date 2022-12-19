package com.jlc.string;

import javax.swing.plaf.basic.BasicArrowButton;

public class Lab491 {
public static void main (String []args) {
	String str="VeeruVipparla";
	byte bArr[]=str.getBytes();
	char ch[]=str.toCharArray();
	System.out.println("\n**Byte array**");
	for (int i = 0; i < bArr.length; i++) {
		byte b=bArr[i];
		System.out.println(i+"\t"+b);
	}
	System.out.println("===========");
	System.out.println("\n**char array**");
	for (int i = 0; i < ch.length; i++) {
		char ch1=ch[i];
		System.out.println(i+"\t"+ch1);
	}
}
}

