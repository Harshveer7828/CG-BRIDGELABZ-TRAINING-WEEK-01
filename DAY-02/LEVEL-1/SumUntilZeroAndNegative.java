import java.util.Scanner;
public class SumUntilZeroAndNegative{
	public static void main(String[] args){
		//Declaring variables which contains user input
		double userInput, total = 0.0;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
		
		// Get the userInput from the user
		System.out.print("Enter the number :- ");
		userInput = input.nextDouble();
		
		// Check is the user input is not a zero and not a negative
		if(userInput > 0){
			// Add the initial user value
			total += userInput;
		}
		
		while(true){
			if(userInput > 0){
				// Get the user input until the user enter 0
				System.out.print("Enter the number :- ");
				userInput = input.nextDouble();	
				total += userInput;
			}
			// break the loop if user enter zero or a negative number
			else break;
		}
		
		// Displaying the information
		System.out.print("Your sum is:- "+total);
		
		//close the scanner input
		input.close();
	}
	
}
