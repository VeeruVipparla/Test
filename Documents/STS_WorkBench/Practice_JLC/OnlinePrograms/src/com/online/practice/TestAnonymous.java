package com.online.practice;

abstract class AnonymousEx {
	abstract void show() {
		System.out.println("Name");
	}

}

class TestAnonymous {
	public static void main(String[] args) {
		TestAnonymous obj = new TestAnonymous() {
			void show() {
				System.out.println("veeru ,raju");
			}
		};

		obj.show();
	}

}