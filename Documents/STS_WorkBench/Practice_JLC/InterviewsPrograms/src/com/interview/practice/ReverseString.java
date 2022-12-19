package com.interview.practice;

public class ReverseString {

	public static void main(String[] args) {
		String str = "veerus vipparla";
		

		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		System.out.println("==============");

		char[] ch = str.toCharArray();
		for(int i=ch.length-1;i>=0; i--){
			System.out.print(ch[i]);//ureev
			
		}
		
		//Recursive Method
		System.out.println();
		System.out.println(str);
		 System.out.println(recursiveMethod(str));    //Output : avaJyM
    }
 
    //Recursive method to reverse string
 
    static String recursiveMethod(String str)
    {
         if ((null == str) || (str.length() <= 1))
         {
                return str;
         }
 
         return recursiveMethod(str.substring(1)) + str.charAt(0);
    }
}

