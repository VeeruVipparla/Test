package Control_Statements;

public class Continue {

	public static void main(String[] args) {
		// for (int i=10; i>=1; i--)
		// {
		// System.out.println(i+ " ");
		// ======== }

		/*
		 * int i = 1, j; lp1: while (i <= 3) { System.out.println(i); // i values change
		 * from 1 to 3 lp2: for (j = 1; j <= 5; j++) { System.out.println("\t" + j); }
		 * i++; System.out.println("----------"); }
		 */
		int i = 1, j;
		lp1: while (i <= 3) {
			System.out.println((i));
			lp2: for (j = 1; j <= 5; j++)

			{
				System.out.println("\t" + j);
				if (j == 3) {
					i++;
					continue lp1;

				}
			}
			i++;
			System.out.println("---------");
		}

	}

}
