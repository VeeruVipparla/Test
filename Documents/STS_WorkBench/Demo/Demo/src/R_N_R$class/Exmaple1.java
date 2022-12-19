package R_N_R$class;

class Example1 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;

		int t = a + b;
		int i = b - a;
		int e = a * b;
		int f = a / b;
		int g = (a+++b*a); 

		System.out.println("total sum of the (a+b)=" + c);
		System.out.println("total sum of the (b-a)=" + d);
		System.out.println("total sum of the (a*b)=" + e);
		System.out.println("total sum of the (a/b)=" + f);
		System.out.println("total sum of the (a+++b*a)=" + g);

		System.out.println("\n");
		System.out.print(a + "\t" + b);
		System.out.println(b + "\n" + b);
		System.out.print(":" + c);
		System.out.println();
		System.out.println("Hello\\Hi\"" + d);
	}
}