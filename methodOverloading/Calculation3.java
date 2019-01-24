package methodOverloading;

public class Calculation3 {
	
	/* Example of overloading by swapping parameter data types */

	public void disp(int x, double y) {

		System.out.println("First method");
	}

	public void disp(double x, int y) {

		System.out.println("Second method");
	}
	
	public static void main(String[] args) {
		
		Calculation3 calc = new Calculation3();
		
		calc.disp(1, 1.8);
		calc.disp(3.43, 99);
		
	}
}
