package com.jlc.generics;

import java.util.PriorityQueue;

public class Lab658 {

	public static void main(String[] args) {
		int values[] = { 1, 5, 3, 7, 6, 9, 8 };
		int len = values.length;
		PriorityQueue<Integer> pq1 = new PriorityQueue<>();
		for (int i : values) {
			pq1.offer(i);
		}
		System.out.println(pq1);
		for (int i = 0; i < len; i++)
			System.out.println("STRINGS");
		String nms[] = { "Veeru", "Ravi", "Rahul", "Virat" };
		int len2 = nms.length;
		PriorityQueue<String> pq2 = new PriorityQueue<>();
		for (String s : nms) {
			pq2.offer(s);
		}
		System.out.println(pq2);
		for (int i = 0; i < len2; i++)
			System.out.println(pq2.poll() + "");
	}
}
