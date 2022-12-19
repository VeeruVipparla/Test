package Control_Statements;

public class Break {

	public static void main(String[] args) {
		boolean x = true;
		bl1: {
			bl2: {
				bl3: {
					System.out.println("Block3");
					if (x)
						break bl2; // goto end of bl2
				}
				System.out.println("Block2"); // end of bl2
			}

			System.out.println("Block1"); // end of bl1
		}

		System.out.println("out of all blocks");
	}

}
