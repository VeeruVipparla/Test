package com.jlc.string;

public class Lab470 {

	public static void main(String[] args) {
		System.out.println("ABC".compareTo("ABC"));
		System.out.println("ABC".compareTo("ADO"));
		System.out.println("ABC".compareTo("ABCDEFG"));
		System.out.println("ABCDEFG".compareToIgnoreCase("ABC"));
		System.out.println("ABC".compareTo("DEF"));
		System.out.println("ABC".compareTo("dbc"));
		System.out.println("BCC".compareToIgnoreCase("acc"));
		System.out.println("BCC".compareToIgnoreCase("bcc"));
		System.out.println("===============");
		int ab=98;
		//String s=ab;
		//String ss=(String)ab;//Cannot cast from int to String
		String s1=String.valueOf(ab);
		String s2=String.valueOf(true);
		String s3=String.valueOf(false);
		String s4=String.valueOf('A');
		String s5=String.valueOf(55.00);
		
		System.out.println(s1+"\t"+s2+"\t"+s3+"\n"+s4+"\t"+s5);
		
	}

}
