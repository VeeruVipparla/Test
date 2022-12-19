package com.jlc.miscellaneous;

public class InhertanceEx_1 {

	public static void main(String[] args) {
		Bike b = new Bike();

//		System.out.println("Show value of Car::- " + b.s);
//		System.out.println("Show value of Bike::- " + b.s1);
		System.out.println("Part Name of Bike::- " + b.s1 + "\n" + "Part Name of Car::- " + b.s);
	}

}

class Car {
	String s = "Engine";

}

class Bike extends Car {
	String s1 = "Radiator";

}