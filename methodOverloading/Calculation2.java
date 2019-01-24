package methodOverloading;

public class Calculation2 {

	/* This class is an example of overloading via changing data types of parameters */

	void sum(int a, int b ) {
		
		System.out.println(a+b);
	}
	
	void sum(double a, double b) {
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
		Calculation2 calc2 = new Calculation2();
		calc2.sum(100, 3);
		calc2.sum(100.13, 3.1);
	}
}
