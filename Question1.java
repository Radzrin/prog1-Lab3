import java.util.*;


public class Main{
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
		
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		//switch case
		switch (number) {
		
		case 1 : 
		System.out.println("please input a temperature in celcius");
		celcius = sc.nextDouble();
		fahrenheit = (celcius * 9/5) + 32;
		System.out.println("The temperature in fahrenheit is " + fahrenheit);		
		break;
		
		case 2 :
		System.out.println("please input an amount in CAD");    
		Cad = sc.nextDouble();
		Usd = Cad * 0.72;
		System.out.println("The ammount in Usd is " + Usd);   
		break;
		
		case 3 :
		System.out.println("please input a temperature in Kelvins");    
		kelvin = sc.nextDouble();
		celcius = kelvin - 273.15;
		System.out.println("The temperature in celcius is  " + celcius);   
		break;
		
		case 4 :
		System.out.println("please input a mesurement in meters");    
		meters = sc.nextDouble();
		feet = meters * 3.28084;
		System.out.println("The lenght in feet is " + feet);   
		break;
		
		case 5 :
		System.out.println("please input a mesurement in cups");    
		cup = sc.nextDouble();
		tableSpoon = cup/16;
		System.out.println("The ammount in tablespoons is " + tableSpoon);   
		break;
		}

	}		
}	







