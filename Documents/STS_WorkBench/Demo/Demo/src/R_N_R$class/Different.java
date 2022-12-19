package R_N_R$class;

//All the objects need different implements of the same method
abstract class Myclass
{
	//this is abstract method
	abstract void calculate(double x);
}
class Sub1 extends Myclass
{
//calculate square valve
void calculate(double x)
{
	System.out.println("Square="+ (x*x));
	
}

}
class Sub2 extends Myclass 
{
//calculate sqare root valve
void calculate(double x)
{
	System.out.println("Square root="+Math.sqrt(x)); 
}

}
class Sub3 extends Myclass 
{
//calculate cube valve
void calculate(double x)
{
	System.out.println("cube="+(x*x*x));
}

}

class Different
{
	public static void main(String[] args) 
	{
		//create sub class objects
		Sub1 obj1= new Sub1();
		Sub2 obj2= new Sub2();
		Sub3 obj3= new Sub3();
	//let the objects call and use calculate () method
		
		obj1.calculate(3);  //calculate square
		obj2.calculate(4);  //calculate square root
		obj3.calculate(4);  // calculate cube valve
	}
	
}











