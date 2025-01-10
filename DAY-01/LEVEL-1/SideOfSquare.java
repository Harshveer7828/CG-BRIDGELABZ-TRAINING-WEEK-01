import java.util.Scanner;
public class SideOfSquare{
	public static void main(String[] args){
		//Declaring variables which contains perimeter and the side of the square
		float perimeter, lengthOfSide;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the perimeter of the square :- ");
		
		//Taking perimeter input from the user
		perimeter = input.nextFloat();
		
		
		//Calculating the side of the square
		lengthOfSide = perimeter/4;
		
		//Display the information
		System.out.print("The length of the side is " + lengthOfSide + " whose perimeter is "+perimeter);
		
		//close the scanner input
		input.close();
		
	}
	
}