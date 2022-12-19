package Arrays;

//public class Demo_3 {

	//public static void main(String[] args) {
		import java.util.Scanner;

		class Demo_3 {
		  public static void main(String[] args) {

		    // creates an object of Scanner
		   Scanner input = new Scanner(System.in);

		    System.out.print("Enter your name: ");

		    // takes input from the keyboard
		    String name = input.nextLine();

		    // prints the name
		    System.out.println("My name is "+"\n" + name);

		    // closes the scanner
		    input.close();
		  }

	}


