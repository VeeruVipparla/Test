package com.veeru.java.collection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;


public class Stackdemo {

	public static void main(String[] args)throws Exception {
		Stack<Integer> st= new Stack <Integer>();
		int choice =0;
		int position, element ;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while (choice<4)
		{
			System.out.println("Stack Operations");
			System.out.println("1 Push an element");
			System.out.println("2 Pop an element");
			System.out.println("3 Search an element");
			System.out.println("4 Exit");
			System.out.println("your choice");
			
			choice = Integer.parseInt(br.readLine());
			
			switch(choice) {
			case 1: 
				System.out.print("enetert an elements:");
			element = Integer.parseInt(br.readLine());
			st.push(element);
			System.out.println("elements are store in stack :: "+st);
			break;
			
			case 2: 
				Integer obj= st.pop();
			System.out.println("popped="+obj);
			break;
			
			case 3:
				System.out.println("which elemnts?");
			element = Integer.parseInt(br.readLine());
			position = st.search(element);
			
			if (position==-1)
			System.out.println("Elements not found");
			else 
				System.out.println("Position: "+ position);
			break;
			
			default :
				System.out.println("Not available");
			return;
			
		} //switch
			System.out.println("stack contents:"+st);
			
		} //while		
	}//main
} //class
	
	