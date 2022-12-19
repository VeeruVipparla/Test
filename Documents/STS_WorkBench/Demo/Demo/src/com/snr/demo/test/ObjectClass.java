package com.snr.demo.test;


/*class test{
	//varibles 
	//methods
	void shpw() throws Throwable {
		finalize();
	}
}*/


public class ObjectClass  implements Cloneable{
	
	int id;
	String name;
	
	

	public ObjectClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	void show() {
		System.out.println("Student Id ::"+id +"\t"+ "student Name :"+name);
	}



	public static void main(String[] args)throws CloneNotSupportedException {
		/*
		 * Test t=new Test(); System.out.println(t.getClass());
		 * 
		 * int a=5; int b=10; if(a==b) { //== reference No or hashcode
		 * System.out.println("both are equal P>D>T");
		 * 
		 * }else { System.out.println("Both are not equal"); }
		 */
		
	/*	
		String str1="SNRaju";
		String str2= "SNRaju";
		
		if(str1.equals(str2)) {
			System.out.println("content of the object are same"+str1.hashCode()+"\t"+str2.hashCode());
		}else {
			System.out.println("content are not same");
		}
		
		Object obj="veeru";
		Object obj1="veerru";
		if(obj1.equals(obj)) {
			System.out.println("content same");
		}*/
		
		/* public boolean equals(Object obj) {
		        return (this == obj);
		    }
		    
		    */

		//*/
		
		/*
		Test t=new Test();
		System.out.println(t.toString());//Test@0X12345 Test@15db9742
		
		
		/*
		 * public String toString() { return getClass().getName() + "@" +
		 * Integer.toHexString(hashCode());// }
		 */
	
			
		EmployeeOne emp=new EmployeeOne(100,"veeru");
		emp.getdata();
		
		EmployeeOne emptwo=(EmployeeOne) emp.MyClone();
		emptwo.getdata();
		
		
		ObjectClass emp1=new ObjectClass(500,"RagaSpanda");
		emp1.show();
		
		ObjectClass Ragaemp=(ObjectClass) emp1.clone();
		
		Ragaemp.show();
		
	
		//protected native Object clone() throws CloneNotSupportedException;

		
		
		//public final native Class<?> getClass();  x

	}

}
