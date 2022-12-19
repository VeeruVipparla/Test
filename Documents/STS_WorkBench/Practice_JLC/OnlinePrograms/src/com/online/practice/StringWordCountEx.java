package com.online.practice;

import java.util.StringTokenizer;

public class StringWordCountEx {

	public static void main(String[] args) {
		String str1 = "India Is My Country";
		StringTokenizer stringToken = new StringTokenizer(str1);
		int countTokens = stringToken.countTokens();
		System.out.println(countTokens);

		System.out.println(new StringTokenizer("This    is  a    test     app").countTokens());
		
		String str="Today Is A Holiday";
		int count=1;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count);
	}

	}


