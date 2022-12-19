package com.interview.practice;

public class InhertanceEx_2 {

	public static void main(String[] args) {
		Programmer p = new Programmer();
		System.out.println(p.salary);
		System.out.println(p.bonus);
	}

}

class Employee {
	float salary = 108753;
}

class Programmer extends Employee {
	int bonus = 12936;
}
