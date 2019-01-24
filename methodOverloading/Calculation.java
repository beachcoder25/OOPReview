package methodOverloading;

/* METHOD OVERLOADING
 * 
 * Can occur with the following 3 conditions
 * 1) Changing number of arguments(parameters)
 * 2) By changing the data type of an argument (Double -> int)
 * 3) The sequence(order) of data type of parameters
 */

public class Calculation {
	
	/* This class is an example of overloading via a different number of parameters */

	void sum(int a, int b ) {
		
		System.out.println(a+b);
	}
	
	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	public static void main(String[] args) {
		Calculation calc = new Calculation();
		calc.sum(100, 3);
		calc.sum(100, 3, 45);
	}
}
