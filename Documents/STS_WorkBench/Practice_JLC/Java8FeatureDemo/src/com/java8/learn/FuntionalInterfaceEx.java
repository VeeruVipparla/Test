package com.java8.learn;

import java.util.function.Function;

public class FuntionalInterfaceEx {

	public static void main(String[] args) {
		 // Function which takes in a number
	    // and returns half of it
	    Function<Integer, Double> half =a -> a / 2.0;

	    // apply the function to get the result
	    System.out.println(half.apply(10));//ans - 5.0
	    
		Function<String, String> f= s -> s.toUpperCase();
		System.out.println(f.apply("veeru"));//ans -5
		
		
		Function<Integer, Integer> f1=i-> 2*i;
		Function<Integer, Integer> f2=i-> i*i*i;
		System.out.println(f1.andThen(f2).apply(2)); //o/p ; 64
		System.out.println(f1.compose(f2).apply(2)); // o/p:16
		
		
	    Function i = Function.identity(); 
	    
        System.out.println(i);

        
        Function<Integer , Float> full=b-> b /3f;
        System.out.println(full.apply(15));
        
        Function<String , String> half1=c-> c+"Veeru";
        System.out.println(half1.apply("Veera"));
        
        Function<String , String > full1=d-> d.toUpperCase();
        System.out.println(full1.apply("javaone"));
        
        Function<Integer, Integer> a1=j-> 3*j;
        Function<Integer, Integer> b1=j-> j*j*j;
        System.out.println(a1.andThen(b1).apply(3));
        System.out.println(a1.compose(b1).apply(3));
        
        
        
        


	}

}
