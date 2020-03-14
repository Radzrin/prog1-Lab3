import java.util.*;

/**
 *
 * @author Christopher Benson
 */
public class Question5 {

	public static void main(String[]args) {
	
	//variables 
		Date today = new Date();
	    int Year = today.getYear();
        int Month = today.getMonth();
        int Day = today.getDay();
        int CurrentYear = Year + 1900;
        int CurrentMonth = Month + 1; 
        int CurrentDay = Day + 5;
        int age;
        int days;
        int yearOfBirthday;
        int dayCount;
        int amOfDays;
        int check;
        int remaining;
        int remaining2;
        int passed;
        int passed2;
        String birthday;
        String birthYear;
        String birthMonth;
        String dayOfBirth;
    
     
    //user inputs their birthday
    Scanner sc = new Scanner(System.in);
    System.out.println("please input your birthday in the following format YYYY-MM-DD");
    birthday = sc.nextLine();
    System.out.println("your birthday is " + birthday);
      
    //check if it's a leap year
    if ((CurrentYear % 4 == 0)) {
    days = 366;
    } else {
    days = 365;
    }
    
    //string the birthday
	birthYear = birthday.substring(0,4);
	birthMonth = birthday.substring(5,7);
	dayOfBirth = birthday.substring(8,10);
	
	//turn the birth date (string) into int
	int y = Integer.parseInt(birthYear);
    int m = Integer.parseInt(birthMonth);
    int d = Integer.parseInt(dayOfBirth);
    

    //gets the ammount of days since or to said birthday
    amOfDays = days/12;
    check = (amOfDays * CurrentMonth) + CurrentDay; 
    dayCount = (amOfDays * m + d) - check;    
    yearOfBirthday = (m + d) - (CurrentMonth + CurrentDay);
    

    //get the age of the User
    System.out.println("");
    age = CurrentYear - y;
    if (yearOfBirthday >= 0) {
        age = age - 1;
    }
    System.out.println("you are " + age + " years old");

    //making sure your birthday was this year
    if (yearOfBirthday >= 0) {
        yearOfBirthday = CurrentYear;
    }
    
    //checking how many days until your birthday
    remaining = dayCount - 2; 
    remaining2 = remaining + 5;
    passed = dayCount;
    passed2 = Math.abs(passed - 2); 
    
    //check if the date has passed
    System.out.println("");
    
    if (m >= 11 && d >= 01 && dayCount > 0) {
    System.out.println("your birthday is in " + remaining2 + " days");
    } else if ((dayCount > 0) && ( dayCount <= days) && (yearOfBirthday == CurrentYear)){
    System.out.println("your birthday is in " + remaining + " days");
    }else  {
    System.out.println("your birthday was " + passed2 + " days ago");
    }
	    
	
	}
}
    
