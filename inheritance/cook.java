package inheritance;

public class cook extends employee{
	
	int bonus = 5;
	
	cook(){
		
	}
	
	public static void main(String[] args) {
		
		cook headCook = new cook();
		
		System.out.println("Salary: " + headCook.salary + "\nBonus: " + headCook.bonus);
		
	}

}
