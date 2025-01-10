import java.util.Scanner;
public class FindingQuotientAndRemainder{
	public static void main(String[] args){
		//Declaring variables which contains number1 and number2
		int number1, number2;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number number1 :- ");

		//Taking number1 from the user
		number1 = input.nextInt();
		
		System.out.print("Enter the number number1 :- ");
		
		//Taking number2 from the user
		number2 = input.nextInt();
		
		//Calculating the quotient of the two numbers
		int quotientOfNumbers = number1 / number2;
		
		//Calculating the remainder of the two numbers
		int remainderOfNumbers = number1 % number2;
		
		//Display the information
		System.out.print("The Quotient is "+ quotientOfNumbers +" and Reminder is "+ remainderOfNumbers +" of two number "+number1 + " and "+number2);
		
		//close the scanner input
		input.close();
		
	}
	
}