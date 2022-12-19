package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo_2d {

	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("how many subjects?");
		int n = Integer.parseInt(br.readLine());
		int[] marks = new int[n];
		for (int i = 0; i < n; i++)
		{
			System.out.println("Entermarks:");
		marks[i] = Integer.parseInt(br.readLine());
		}
		int tot = 0;
		for (int i = 0; i < n; i++)
			tot += marks[i];
		System.out.println("Total marks=" + tot);
		float percent = (float) tot / n;
		System.out.println("percentage =" + percent);

	}

}
