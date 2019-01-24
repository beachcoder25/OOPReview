package inheritance;

public class cook extends employee{
	
	int bonus = 5;
	
	cook(){
		
	}
	
	public static void main(String[] args) {
		
		cook headCook = new cook();
		
		employee headCook2 = new cook();
		
		System.out.println("Salary: " + headCook.salary + "\nBonus: " + headCook.bonus);
		System.out.println();
		System.out.println("Salary: " + headCook2.salary + "\nBonus: N/A (invoked as Employee instance)");
		
	}

}
