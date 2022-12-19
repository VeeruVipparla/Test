package R_N_R$class;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList<>();
		al.add("10");
		al.add("SNRaju");
		al.add(10.10f);
		
		System.out.println("arraylist :: "+al);
		System.out.println("arraylist size:: "+al.size());
		al.remove(1);
		System.out.println("arraylist :: "+al.get(0));

	}

}
