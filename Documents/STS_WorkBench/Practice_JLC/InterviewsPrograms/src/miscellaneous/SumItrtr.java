package miscellaneous;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class SumItrtr {
	// public static void main(String[] args) {

	private static int sumStream(List<Integer>list) {
		return list.stream().filter(i->i>10).mapToInt(i->i).sum();
		
		Stream <T>(peek;Consumer<? super T>action));
	}

}

//}

/*
 * public static int main(String[] args) { private static int
 * sumIterator(List<Integer> list) {
 * 
 * 
 * 
 * Iterator<Integer> it= List.iterator();
 * 
 * 
 * int sum = 0; while(it.hasNext()) { it num = (it) it.next(); if (num > 10) {
 * sum += sum;
 * 
 * } }return sum; }
 * 
 * } }
 */