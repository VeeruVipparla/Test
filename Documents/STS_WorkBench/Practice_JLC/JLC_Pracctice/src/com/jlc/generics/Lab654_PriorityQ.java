package com.jlc.generics;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab654_PriorityQ {

	public static void main(String[] args) {
		Queue <Stud> que=new PriorityQueue<Stud>();
		que.add(new Stud(6266));
		que.add(new Stud(100));
		que.add(new Stud(233));
		
		System.out.println(que);
		System.out.println("Main Completed");
		
	}

}
class Stud{
	int sid;
	Stud(int sid){
		this.sid=sid;
	}
	@Override
	public String toString() {
		return "Stud [sid=" + sid + "]";
	}
}