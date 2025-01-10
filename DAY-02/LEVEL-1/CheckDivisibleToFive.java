import java.util.Scanner;
public class CheckDivisibleToFive{
	public static void main(String[] args){
		//Declaring variables which contains user number
		int number;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Number :- ");
		
		// Get input value for number
		number = input.nextInt();

		// Condition to check is the number is divisible by 5 or not
		boolean isDivisibleByFive =(number % 5 == 0);
		
		//Display the information
		System.out.print(" Is the number " + number + " divisible by 5? "+ isDivisibleByFive);
		
		//close the scanner input
		input.close();
		
	}
	
}