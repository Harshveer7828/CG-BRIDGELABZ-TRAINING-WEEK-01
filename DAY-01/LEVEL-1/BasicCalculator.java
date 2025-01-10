import java.util.Scanner;
public class BasicCalculator{
	public static void main(String[] args){
		//Creating variable which stores the two  numbers and values all operation
		float number1, number2 , addition, subtraction, multiplication , division;
		
		// Creating an instance of Scanner class
		Scanner input = new Scanner(System.in);
		
		//Taking the number1 from the user
		System.out.print("Enter number1 :- ");
		number1 = input.nextFloat();

		//Taking the number2 from the user		
		System.out.print("Enter number2 :- ");
		number2 = input.nextFloat();
		
		// Assigning the values of all operations
		addition =  number1  + number2 ;
		subtraction =  number1 - number2;
		multiplication = number1 * number2;
		division = number1 / number2;

		System.out.print(" The addition, subtraction, multiplication and division value of 2 numbers "+ number1 +" and " + number2+ " is " +addition+" , " +subtraction+" , " +  multiplication+" , and "+ division	);
input.close();
	}
	
}