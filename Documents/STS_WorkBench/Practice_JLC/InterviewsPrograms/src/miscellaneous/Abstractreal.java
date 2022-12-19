package miscellaneous;


abstract class Beverages {

	// Defined
	public void addMilk() {

	}

	// abstract
	abstract void addIngredient();
}
class Coffee extends Beverages {

	void addIngredient() {
		System.out.println("add Coffee");
	}
}
public class Abstractreal {

	public static void main(String[] args) {

		Coffee b = new Coffee();
		b.addMilk();
		b.addIngredient();
	}
}

