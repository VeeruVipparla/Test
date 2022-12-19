package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.sun.org.apache.bcel.internal.generic.SWAP;

public class Demo_2d1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("how many elements? ");
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)   // accept the integer elements into array
		{
			System.out.println("Enter int");
			arr[i] = Integer.parseInt(br.readLine());
		}
		int limit = n - 1;
		boolean flag = false;
		int temp;
		for (int i = 0; i < limit; i++)

		{
			for (int j = 0; j < limit - i; j++) {

				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}

			if (flag == false)
				break;
			else
				flag = false;
		}
		System.out.println("the sorted array is:");
		for (int i = 0; i < n; i++)
			System.out.println(arr[i]);

	}

}
