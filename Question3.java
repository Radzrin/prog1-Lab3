import java.util.*;


public class Question3 {
	
	/* This program prompts the user for the temperature in Celsius and outputs a different message 
	when the temperature is positive or negative */
	
	public static void main(String[]args){
	
		//variables
		double temp;
		String temp1 = ""; 
		//Ask the user for the temperature
		
		System.out.println("What is the temperature in Celsius ?");
		Scanner sc = new Scanner(System.in);
		temp = sc.nextDouble();
		
		//check if the temperature is positive of negative
		
		temp1 = (temp > 0) ? "hot":"cold";
		//message 1
			System.out.println("\n"+temp1);		
		//message 2

	}	

}	
	