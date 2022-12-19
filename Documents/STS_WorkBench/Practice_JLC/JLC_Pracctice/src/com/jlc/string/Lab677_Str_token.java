package com.jlc.string;

import java.util.StringTokenizer;

public class Lab677_Str_token {

	public static void main(String[] args) {
	String str=" +Hi This is veeru \n \n from \t Sattenpalle";
	StringTokenizer stok=new StringTokenizer(str);
	System.out.println("Count ::"+stok.countTokens());
	while(stok.hasMoreElements()) {
		String data=stok.nextToken();
		System.out.println(data);
	}
	System.out.println(str);
	System.out.println();
	System.out.println("Count :"+stok.countTokens());
	System.out.println("\n \n With , Declimiter\n");
	String data1="116 Veeranji, VeeruVipparla@gmail.com, 7893624102";
	StringTokenizer tkns=new StringTokenizer(data1, " ");
	int id=Integer.parseInt(tkns.nextToken());
	String nm=tkns.nextToken();
	String eml=tkns.nextToken();
	long phn=Long.parseLong(tkns.nextToken());
	System.out.println("ID::"+id);
	System.out.println("Name::"+nm);
	System.out.println("Email::"+eml);
	System.out.println("Phone::"+phn);
	
	

}
}