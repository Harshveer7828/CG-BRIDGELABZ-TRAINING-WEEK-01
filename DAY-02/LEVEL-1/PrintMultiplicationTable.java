import java.util.Scanner;
public class PrintMultiplicationTable{
	public static void main(String[] args){
		//Declaring variables which contains user input
		int number;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
	
		// Get the table number from the user
		System.out.print("Enter the table number:- ");
		number = input.nextInt();
		
		// Using for loop to print the multiplication table
		for(int i = 6; i <= 9; i++){
			System.out.println(number + " * " + i +" = "+ (number * i));
		}

		//close the scanner input
		input.close();
	}
	
}
