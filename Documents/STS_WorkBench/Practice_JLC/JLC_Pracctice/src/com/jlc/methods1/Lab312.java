package com.jlc.methods1;

public class Lab312 {
	public static void main(String[] args) {
		Hello4 h = new Hello4();
		h.sum(new int[0]);
		h.sum(new int[] { 12, 34, 54 });
		h.sum(new int[] { 10, 20, 30, 40 });
//		h.sum(12, 34, 54);// The method sum(int[]) in the type Hello4 is not applicable for the arguments
		// (int, int, int)

	}
}

class Hello4 {
	void sum(int arr[]) {
		System.out.println("Length of Array::- " + arr.length);
		int s = 0;
		for (int a : arr) {
			s = s + a;

		}
		System.out.println("Sum is a::- " + s);
	}

}