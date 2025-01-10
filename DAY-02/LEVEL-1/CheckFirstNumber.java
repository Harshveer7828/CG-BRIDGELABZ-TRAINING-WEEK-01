import java.util.Scanner;
public class CheckFirstNumber{
	public static void main(String[] args){
		//Declaring variables which contains user values of three number
		int number1, number2, number3;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Number1 :- ");
		
		// Get input value for number1
		number1 = input.nextInt();

		System.out.print("Enter the Number2 :- ");
		
		// Get input value for number2
		number2 = input.nextInt();

		System.out.print("Enter the Number3 :- ");
		
		// Get input value for number3
		number3 = input.nextInt();
		
		// Variable which stores the result
		boolean isSmallest;

		// Condition to check if the first number is smallest among three numbers
		if((number1 < number2 ) && (number1 < number3)){
			isSmallest = true;
		}else isSmallest = false;
		
		
		//Display the information
		System.out.print(" Is the first number the smallest? "+ isSmallest);
		
		//close the scanner input
		input.close();
		
	}
	
}