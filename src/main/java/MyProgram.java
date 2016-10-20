import java.util.ArrayList;
import java.util.Scanner; 

public class MyProgram {

		  
	
	public String program(String input) {
		
		return input;
	}
	
	public String arrayLs(String user) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Skriv in Användarnamn: ");
		user = sc.nextLine(); 
		
		if(user.equals("Slisk")) {
			return "Välkommen"; 
		}
		return "Access denaid"; 

			
		   
		
	}

		
} 
