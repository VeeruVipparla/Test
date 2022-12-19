package com.jlc.generics;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab659 {

	public static void main(String[] args) {
		Queue <String> que=new PriorityQueue<>();
		que.add("Single");
		que.add("Double");
		que.add("Third");
		que.offer("Fourth");
		que.offer("Fifth");
		que.offer("Sixth");
		System.out.println("Size::"+que.size());
		System.out.println("Peek::"+que.peek());
		System.out.println("Size::"+que.size());
		System.out.println("Element::"+que.element());
		System.out.println("Size::"+que.size());
		System.out.println("Poll::"+que.poll());
		System.out.println("Size::"+que.size());
		que.clear();
		System.out.println(que);
		//System.out.println(que.element());// java.util.NoSuchElementException
		System.out.println(que.size());
		
	}

}
