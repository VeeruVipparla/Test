package com.online.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Vehicle {

	private String owner;
	private String name;
	private int price;

	Vehicle(String owner, String name, int price) {
		this.owner = owner;
		this.name = name;
		this.price = price;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOwner() {
		return owner;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getName() {
		return name;

	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getprice() {
		return price;
	}

/*	public String toString() {

		return "[Vehicle Details]::" + "Owner of Vehicle::" + owner + "Name of Vehicle::" + name + "Price of Vehicle::"
				+ price;

	}
*/	
}

public class LinkToMap {

	public static void main(String args[]) {
		List<Vehicle> details = new ArrayList<>();
		details.add(new Vehicle("Veeru", "Fortuner", 4000000));
		details.add(new Vehicle("Raju", "BENZ", 7200000));
		details.add(new Vehicle("Lasya", "Zaguar", 3500000));

		Map<String, Integer> mapList1 = new HashMap<>();
		Map<String, Integer> mapList2 = new LinkedHashMap<String, Integer>();

		for (Vehicle v : details) {
			mapList1.put(v.getOwner(), v.getprice());
			mapList2.put(v.getName(), v.getprice());

		}
		System.out.println(mapList1);
		System.out.println(mapList2);

		Map<String, String> result = details.stream().collect(Collectors.toMap(Vehicle::getName, Vehicle::getOwner));
		System.out.println(result);
		
	}

}
