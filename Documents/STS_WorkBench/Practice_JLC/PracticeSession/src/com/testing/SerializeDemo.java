package com.testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal {
	public int i = 10;

	Animal() {
		System.out.println("Animal Constructor called");
	}
}

class Dog extends Animal implements Serializable {
	public int j = 20;

	Dog() {

		System.out.println("Dog Constructor called");
	}
}

public class SerializeDemo {

	public static void main(String[] args) throws Exception {
		Dog d1 = new Dog();
		d1.i = 888;
		d1.j = 999;

		FileOutputStream fos = new FileOutputStream("ab.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);

		System.out.println("DeSerialozation Starts");

		FileInputStream fis = new FileInputStream("ab.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println(d2.i + "..." + d2.j);
	}

}
