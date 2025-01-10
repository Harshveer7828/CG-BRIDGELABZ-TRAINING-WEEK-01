import java.util.Scanner;
public class CompareTheSum{
	public static void main(String[] args){
		//Declaring variables which contains user input
		int userInput, sum = 0, formulaSum = 0;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
	
		// Get the userInput from the user
		System.out.print("Enter the number:- ");
		userInput = input.nextInt();
		
		//check the userInput is a natural number and Computing formula sum
		if(userInput > 0){
			formulaSum = (userInput * (userInput + 1)) / 2;
		}
		
		while(userInput > 0){
			sum += userInput--;
		}
		
		
		// Displaying the information
		System.out.print("The Sum from the formula is:- " + formulaSum + " and using while loop is:- " + sum);
		
		//close the scanner input
		input.close();
	}
	
}
