package com.snr.demo.test;


public class Test2{

    public static void main(String[] args) throws CloneNotSupportedException 
    {
        //Array with duplicate elements
        Integer[] numbers = new Integer[] {1,2,3,4,5,1,3,5};
         
        //This array has duplicate elements
        System.out.println( Array.toString(numbers) );
         
        //Create set from array elements
        LinkedhHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(numbers) );
         
        //Get back the array without duplicates
        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
         
        //Verify the array content
        System.out.println( Arrays.toString(numbersWithoutDuplicates) );
    }
}























		
	
	
		
		
		
	

	
