package miscellaneous;
public class NullPointerExTest {

	public static void main(String[] args) {
		String str = null;
		//System.out.println(str.equals("SNRaju"));
	//	print(str);
		
		printShow(18,3);
		
		
	}

	private static Boolean  print(String str) {
		//if(str !=null) {
			System.out.println(str.equals("SNRaju"));
			return true;
		}
	
	static int printShow(int a,int b) {
		try {
			int x=a/b;
			System.out.println(x);
			return x;
			
	}catch (Exception e) {
		// TODO: handle exception
		System.out.println("Exception");
	}
		//return b;
	}
		
		
	}


