import java.util.Scanner;

public class Question2{

	/*This program prompts the user their mass in pounds and their height in feet
	then does the BMI equation to outputs the user's BMI 
	*/
	
    public static void main(String[] args) {
		
		//variables
        System.out.println("what is your BMI? ");		
		double kg;
        double meters;
		double feet;
		double pounds;
		final double BMI;

		
		//weight in kg
        Scanner in = new Scanner(System.in);
        System.out.println("How heavy are you in pounds  ?");
        pounds = in.nextDouble();
		kg = 0.453592 * pounds;
        System.out.println("Your weight should be " + kg + "kg");

		//height in meters and BMI output
        System.out.println("what is your height in feet ?");
        feet = in.nextDouble();
		meters = 0.3048 * feet;
		double square = Math.pow(meters, 2);
		BMI = kg / square;
        System.out.println("your BMI should be " + BMI);
		
		System.out.println("");
		//BMI classification
		if (BMI < 18.5) {
			System.out.println("you are underweight");
		} else if (BMI <= 25.9) {
			System.out.println("you are normal weight");
		} else if (BMI <=  29.9) {
			System.out.println("you are overweight");
		} else if (BMI <= 34.9) {
			System.out.println("you have class 1 obesity");
		} else if (BMI <= 39.9) {
			System.out.println("you have class 2 obesity");
		} else {
			System.out.println("you have class 3 obesity");
		}
			
		
		


	}
}