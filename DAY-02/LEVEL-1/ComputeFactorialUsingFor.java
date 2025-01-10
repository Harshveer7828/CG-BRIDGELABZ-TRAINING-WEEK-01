import java.util.Scanner;
public class ComputeFactorialUsingFor{
	public static void main(String[] args){
		//Declaring variables which contains user input
		int userInput, factorial = 0;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
	
		// Get the userInput from the user
		System.out.print("Enter the number:- ");
		userInput = input.nextInt();
		
		//check the userInput is a natural number and Computing formula sum
		if(userInput > 0){
			factorial = 1;
			//using loop to calculate the factorial
			for(int i = 1; i <= userInput; i++ ){
				// calculate factorial and decrease the userInput
				factorial = factorial * i;
			}
		}
	
		// Displaying the information
		System.out.print("Factorial of number  is:- "+factorial);
		
		//close the scanner input
		input.close();
	}
	
}
