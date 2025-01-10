import java.util.Scanner;
public class CheckSpringSeason{
	public static void main(String[] args){
		//Declaring variables which contains user input
		int month, day;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the month number :- ");
		
		// Get input value of month
		month = input.nextInt();

		System.out.print("Enter the day number :- ");
		
		// Get input value of day
		day = input.nextInt();
		
		// Check if the season is a spring or not
		if((month > 3) && (month < 6)){
			System.out.print("Its a Spring Season");
		}
		else if(month == 3 && day >= 20){
			System.out.print("Its a Spring Season");
		}
		else if(month == 6 && day <= 20){
			System.out.print("Its a Spring Season");
		}
		else{
			System.out.print("Not a Spring Season");
		}
		
		
		
		
		
		//close the scanner input
		input.close();
		
	}
	
}