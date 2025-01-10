import java.util.Scanner;
public class ChecksNumber{
	public static void main(String[] args){
		//Declaring variables which contains user input
		int number;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number :- ");
		
		// Get input value of number
		number = input.nextInt();

		// Check if the number is equal to zero
		if(number == 0){
			System.out.print("Zero");
		}
		
		// Condition to check the if number is positive 
		else if(number > 0 ){
			System.out.print("positive");
		}
		
		else{
			System.out.print("Negative");
		}
		
		
		
		
		//close the scanner input
		input.close();
		
	}
	
}