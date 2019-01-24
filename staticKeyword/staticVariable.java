package staticKeyword;

/* When we use a static variable we are able to save memory as it is allocated only ONCE for that variable
 * instead of every time an instance is created as shown below
 */


/* Console Output from this example:
 
Name: Sam Sammison
ID number :11
Company name: Target

Name: Jimmy Jim
ID number :2
Company name: Target
*/



public class staticVariable {
	
	// Instance variables
	
	int idNumber;
	String name;
	static String companyName = "Target";
	
	
	public staticVariable(int idNumber, String name){
		
		// Since companyName is static we assume that each instance belongs to the same company
		// No need to take in the parameter for companyName
		
		this.idNumber = idNumber;
		this.name = name;
		
		// As shown in the main method using the accessor getCompanyName
		// We see that the companyName is the same for all instances
		
	}
	
	public String getCompanyName() {
		
		return companyName;
	}
	
	
	public String getName() {
		
		return name;
	}
	
	public int getIDnumber() {
		
		return idNumber;
	}
	
	
	public static void main(String[] args) {
		
		staticVariable instanceOfClass = new staticVariable(11, "Sam Sammison");
		staticVariable otherInstanceOfClass = new staticVariable(2, "Jimmy Jim");
		
		System.out.println("Name: " + instanceOfClass.getName() + "\nID number :" + instanceOfClass.getIDnumber()
				+ "\nCompany name: " + instanceOfClass.getCompanyName());
		
		System.out.println();
		
		System.out.println("Name: " + otherInstanceOfClass.getName() + "\nID number :" + otherInstanceOfClass.getIDnumber()
		+ "\nCompany name: " + otherInstanceOfClass.getCompanyName());
		
	}

}
