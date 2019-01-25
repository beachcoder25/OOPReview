package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/* A checked exception is a compile-time exception
 * and MUST be handled for the program to compile
 */


public class checkedException {
	
	public static void main(String[] args) {
		
		
		try {
			
			File file = new File("F://file.txt");
			FileReader fr = new FileReader(file);
		}
		
		catch (FileNotFoundException exception){
			System.out.println("You have entered a file that does not exist");
			
		}
		
	}
	
	

}
