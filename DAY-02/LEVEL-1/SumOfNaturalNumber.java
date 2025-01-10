import java.util.Scanner;
public class SumOfNaturalNumber{
	public static void main(String[] args){
		//Declaring variables which contains user values of three number
		int number;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Number :- ");
		
		// Get input value for number1
		number = input.nextInt();

		// Condition to check the number is positive or a natural number
		if(number > 0){
			int sum = (number * (number + 1) ) / 2;
			System.out.print("The sum of " + number +" natural numbers is "+sum);
		}else{
			System.out.print("The number "+ number+" is not a natural number");
		}
		
		
		
		
		//close the scanner input
		input.close();
		
	}
	
}