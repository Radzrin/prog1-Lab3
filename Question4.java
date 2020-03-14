/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;
import java.util.*;
/**
 *
 * @author Christopher Benson
 */
public class Question4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
		
		int number;
		System.out.println("please insert a number between 1 and 5");
		System.out.println("");
		System.out.println("1. convert celcius to fahrenheit");
		System.out.println("2. convert CAD to USD");
		System.out.println("3. convert kelvins to celcius");
		System.out.println("4. convert meters to feet");
		System.out.println("5. convert cups to tablespoons");
		System.out.println("");
		
			//variables
		double Cad, Usd, cup, tableSpoon, fahrenheit, celcius, kelvin, meters, feet;
		
		fahrenheit = (celcius × 9/5) + 32;
		
		//switch case
		switch (number) {
		
		case 1 : 
		System.out.println("please input a temperature in celcius");
		Scanner sc = new Scanner(System.in);	
		celcius = sc.nextLine();
		System.out.println("The temperature in fahrenheit is " + fahrenheit);		
		break;
      
		
		
		
			
			



	}		
}	


    
        
        
        
        
        
         
    
