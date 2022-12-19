package Arrays;

// addition of two numbers using command line args
 class Program {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println(" Please enter values");
			return;
		}
		// take the numbers from args
		// they would be in String form

		String s1 = args[0];
		String s2 = args[1];

		// convert them into numerics

		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);

		// add them and display

		double d3 = d1 + d2;
		System.out.println("The sum=" + d3);

	}

}// we give the values by using run configuration in RunAs
