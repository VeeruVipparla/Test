package com.veeru.java.collection;

public class Factory {
	public static Factory  instance=null;
	
	public static void main(String[] args) {
		System.out.println("Factory method.....");
		System.out.println(Factory.instance);
		
	}

	
	public static Factory Instance(Factory  instance){
	
		System.out.println("Inside factory");
		if (instance==null) {
			instance=new Factory();
		}
		return instance;
				
		
		
	}
}



