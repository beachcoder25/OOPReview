package interfaceExample;

public class Tester {

	public static void main(String[] args) {

		String[] words = {"Jerry", "was", "a", "racecar", "driver"};
		Measurer lengthMeasurer = new StringMeasurer();
		System.out.println("Average length: " + average(words, lengthMeasurer));
	}

	public static double average(Object[] objects, Measurer meas) {

		if(objects.length == 0){ return 0;}
		double sum = 0;
		for(Object obj : objects)
		{
			sum = sum + meas.measure(obj);
		}
		return sum / objects.length;
	}

}
