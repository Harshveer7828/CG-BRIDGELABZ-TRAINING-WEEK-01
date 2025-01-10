import java.util.Scanner;
public class ComputeOddAndEven{
	public static void main(String[] args){
		//Declaring variables which contains user input
		int userInput;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
	
		// Get the userInput from the user
		System.out.print("Enter the number:- ");
		userInput = input.nextInt();
		
		//check the userInput is a natural number and Computing formula sum
		if(userInput > 0){
			// Using for loop to access the number in range between 1 to userInput
			for(int i = 1; i <= userInput; i++){
			
				//Conditions for the even number
				if(i % 2 == 0)System.out.println(i +" is even number");
				
				//Condition for odd number
				else System.out.println(i +" is odd number");
				
			}
		}
	
		
		
		//close the scanner input
		input.close();
	}
	
}
