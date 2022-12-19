package com.notebookpractice;

import java.util.Arrays;

public class Example {

/*	
	public static void main(String args[]) {
		int[] arr = { 10, 20, 30, 40 };
		System.out.println(Arrays.toString(arr));
		swapElements(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void swapElements(int[] arr) {
		int tmp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = tmp;
	}
*/	
	public static void main(String[] args) {
        int[] arr = {8,7,4,6,9,3,2,1};
   //     int arr[]= {1,2,3,4,5,6,7,8};
 //   System.out.println("Array before Swap" + "\n");
 /*       
       for (int element : arr) {
            System.out.println(element);
        }
        //Simple Swapping logic
 */       
       int temp = arr[1];
        arr[1] = arr[7];
        arr[7] = temp;
        int temp1=arr[3];
         arr[3]=arr[5];
         arr[5]=temp1;
  //         System.out.println("\n" + "Array after Swap" + "\n");
  /*       
        for (int element : arr) {
            System.out.print(element);
        }
  */      
        for(int i=0; i<arr.length; i++) {
        	System.out.print(" "+arr[i]);
        }
    }
}
