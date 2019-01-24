package interfaceExample;

public class StringMeasurer implements Measurer {

	@Override
	public double measure(Object obj) {

		String str = (String) obj; // Casting
		return str.length();
	}

}
