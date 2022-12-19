package com.snr.miscellaneous;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pr=new PriorityQueue<>();
		
		  pr.offer(12); pr.offer(43); pr.offer(65);
		  pr.offer(54); pr.offer(4); pr.offer(45);
		  pr.offer(6); pr.offer(4); pr.offer(87);
		  pr.offer(44); pr.offer(40); pr.offer(8);
		  
		
			/*
			 * System.out.println(pr.poll()); System.out.println(pr.poll());
			 * System.out.println(pr.poll()); System.out.println(pr.poll());
			 * System.out.println(pr.poll()); System.out.println(pr.poll());
			 * System.out.println(pr.poll()); System.out.println(pr.poll());
			 * System.out.println(pr.poll()); System.out.println(pr.poll());
			 * System.out.println(pr.poll()); System.out.println(pr.poll());
			 */
		System.out.println("PriorityQueue  values :: "+pr);
		
		

	}

}
