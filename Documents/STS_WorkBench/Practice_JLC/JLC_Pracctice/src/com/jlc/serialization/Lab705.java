package com.jlc.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class Lab705 {

	public static void main(String[] args) throws Exception {
		try (FileInputStream fis = new FileInputStream("D:\\info.txt");//"D:\\info.ser"
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			Object obj = ois.readObject();
			System.out.println(obj);
			System.out.println("Object Deserialized");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
/*Student::-
sid::-99
name::-sri
phone::-78945678
count::-9
Object Serialized*/

/*Student::-
sid::-99
name::-sri
phone::-78945678
count::-3
Object Deserialized*/