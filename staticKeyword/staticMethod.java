package staticKeyword;

/* Static methods do NOT belong to a particular instance of a class
 * rather it belongs to the class itself
 * 
 * To mutate a static variables value you must use a static method to do so
 */

/* RESTRICTIONS
 * 1) Static methods CANNOT use either non-static data members nor call a non-static method directly
 * 2) .this and super. cannot be used in a static method (Both suggest instances of a class!)
 */

public class staticMethod {
	
	public static void main(String[] args) {
		
		System.out.println(staticMethod.squaredValue(50));
	}
	
	static int squaredValue(int n) {
		 
		return n*n;
	}

}
