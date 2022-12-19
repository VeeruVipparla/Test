package com.interview.practice;

import java.util.HashSet;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int t1=5;
			int t2=2;
			int t3=t1/t2;
			System.out.println(t3);
			int out=disp();
			
			System.out.println(out);
			
	}

	private static int disp() {
		HashSet<Integer> h=new HashSet<>();
		h.add( new Integer(1));
		h.add( new Integer(1));
		h.add( new Integer(2));
		return h.size();
	}

}
