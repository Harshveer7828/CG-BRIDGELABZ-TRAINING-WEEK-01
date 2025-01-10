import java.util.Scanner;
public class SumUntil0{
	public static void main(String[] args){
		//Declaring variables which contains user input
		double userInput, sum = 0.0;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
		
		// Get the userInput from the user
		System.out.print("Enter the number :- ");
		userInput = input.nextDouble();
		
		// Add the initial user value
		sum += userInput;
		
		while(userInput != 0){
			// Get the user input until the user enter 0
			System.out.print("Enter the number :- ");
			userInput = input.nextDouble();	
			
			// Add the userInput to the sum
			sum += userInput;
		}
		
		// Displaying the information
		System.out.print("Your sum is:- "+sum);
		
		//close the scanner input
		input.close();
	}
	
}
