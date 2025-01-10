import java.util.Scanner;
public class SwapTwoNumbers{
	public static void main(String[] args){
		//Declaring two variables which contains the two number
		double number1, number2;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number1 :- ");
		
		//Taking number1 from the user
		number1 = input.nextDouble();
		
		System.out.print("Enter the number2 :- ");
		
		//Taking number2 from the user
		number2 = input.nextDouble();
		
		//Swap the two numbers using third variable
		double temp  = number1;
		number1 = number2;
		number2 = temp;
		
		//Display the information
		System.out.print("The swapped numbers are "+ number1 +"and " + number2);
		
		//close the scanner input
		input.close();
		
	}
	
}