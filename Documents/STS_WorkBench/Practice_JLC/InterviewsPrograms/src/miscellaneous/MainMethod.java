package miscellaneous;
/*
 * import java.util.Scanner;
 * 
 * public class RemoveWhiteSpaces {
 * 
 * public static void main(String[] args) { Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("Enter input string to be cleaned from white spaces...!");
 * 
 * String inputString = sc.nextLine();
 * 
 * String stringWithoutSpaces = inputString.replaceAll("\\s+", "");
 * 
 * System.out.println("Input String : "+inputString);
 * 
 * System.out.println("Input String Without Spaces : "+stringWithoutSpaces);
 * 
 * sc.close(); } }
 */
/*
 * import java.util.Scanner;
 * 
 * class RemoveWhiteSpaces { public static void main(String[] args) { Scanner
 * myObj = new Scanner(System.in);
 * 
 * System.out.println("Enter name, age and salary:");
 * 
 * // String input String name = myObj.nextLine();
 * 
 * // Numerical input int age = myObj.nextInt(); double salary =
 * myObj.nextDouble();
 * 
 * // Output input by user System.out.println("Name: " + name);
 * System.out.println("Age: " + age); System.out.println("Salary: " + salary); }
 * }
 */

public class MainMethod
{
    public static void main(String[] args)
    {
    	int b=65;
    	int c=66;
    	String str= "Veeru";
    	int d=b+c;
        System.out.println("Execution starts from this method"+"\n"+"\n"+b+"\n"+c+"\n"+str+"\n"+(b+c)+"\n"+(b*c));
    }
 
    void main(int args)
    {
    	int a=12;
        System.out.println("Another main method"+a);
    }
 
    double main(int i, double d)
   {
        System.out.println("Another main method");
 
        return d;
    }}