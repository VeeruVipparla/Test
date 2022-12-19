package Arrays;

class Class1 {

	public static void main(String[] args) {

		for (String s : args)

			System.out.println(s);
	}
}

class Class2 {
	public static void main(String[] args) {

		// take String type array
		String names[] = { "Veeru", "Raju", "Rama", "Lasya", "Spadana" };
		// call main () of class1 and pass the names array
		Class1.main(names);

	}
}
