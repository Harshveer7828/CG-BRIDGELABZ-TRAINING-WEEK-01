import java.util.Scanner;
public class NoOfPossibleHandshakes{
	public static void main(String[] args){
		//Declaring variables which contains perimeter and the side of the square
		int numberOfStudents;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of students :- ");
		
		//Taking unitPrice from the user
		numberOfStudents = input.nextInt();
		
		
		//Calculating toatal amount of the user
		int maxHandshakes = (numberOfStudents * (numberOfStudents - 1))/2;
		
		//Display the information
		System.out.print("The total of hanshakes possible among "+numberOfStudents+ " is " +maxHandshakes);
		
		//close the scanner input
		input.close();
		
	}
	
}