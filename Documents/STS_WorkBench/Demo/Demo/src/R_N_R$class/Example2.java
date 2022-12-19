package R_N_R$class;

class Example2 {

	public static void main(String[] args) {
		byte x = 10;
		byte y = 11;
		
	
		System.out.println("~x=" + (~x));
		System.out.println("~x&y=" + (x & y));
		System.out.println("~x|y=" + (x | y));
		System.out.println("~x^y=" + (x ^ y));
		System.out.println("~x<<2=" + (x << 2));
		System.out.println("~x>>2=" + (x >> 2));
		System.out.println("~x>>>2=" + (x >>> 2));

	}
}
