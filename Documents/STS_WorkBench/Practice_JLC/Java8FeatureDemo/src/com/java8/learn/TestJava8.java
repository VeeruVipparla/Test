package com.java8.learn;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

class TestJava8 {

	public static void main(String[] args) { 
		TestInterface tf=null;
		 tf=((int x, int y)->{
			System.out.println("================="+(x*y));
			return (x*y);
		});
		tf.show(5, 10);
		//tf.show1();
		tf.show2();
		tf.show3();
		TestInterface.showStaticMethod();
		
		
	
		
		
		
		TestInterface t=(int x, int y)-> {
			System.out.println("================="+(x*y));
			return (x*y);
		};
		
		t.show(10, 20);
		
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				 System.out.println("===run ann ()=== ");
				
			}
		};
		new Thread(r).start();
		
	  Runnable r1=()->{
		  System.out.println("===run1 ()=== ");
	  };new Thread(r1).start();
		
	  
	  Comparator<String> sort=(String str1, String str2)->{
		  System.out.println(str1.compareTo(str2));
		  return str1.compareTo(str2);
		 // return str2.compareTo(str1);//desc order 
		  //return -str1.compareTo(str2); // desc order
	  };
	  
	  sort.compare("veeru", "veeru");
	  
	  
	  List<Integer> list=new ArrayList<>();
	  list.add(20);
	  list.add(11);
	  list.add(10);
	  
	  Stream<Integer> s=list.stream().filter(i-> i%2==0);
	  s.forEach(System.out::println);
		

	}
	
	
	

	

	
	


}
