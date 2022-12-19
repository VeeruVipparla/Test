package R_N_R$class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraysList {
	public static void main(String[] args)
    throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter an integer:"+i);
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("Contents of the array:");
		display(arr);
		Arrays.sort(arr);
		System.out.println("The Sorted array:"+arr);
		display(arr);
		System.out.println("Which elements to search?"+arr);
		int element = Integer.parseInt(br.readLine());
		int index = Arrays.binarySearch(arr, element);
		if(index < 0) 
			System.out.println("Elements not found");
		else 
			System.out.println("Elements found at location:" + (index + 1));

	}

	static void display(int arr[]) {
		for (int i : arr)
			System.out.println(i);

	}

}
