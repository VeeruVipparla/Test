package com.jlc.controlstatements;

public class Lab146 {

	public static void main(String[] args) {
		Course c=Course.adv;
		switch (c) {
		case adv:
			System.out.println("100% Placement Gurantee");
			break;
		case core:
			System.out.println("No Placement Guarantee");
			break;
			
		}

	}

}
enum Course{
	core,adv
}