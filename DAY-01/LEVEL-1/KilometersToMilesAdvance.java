import java.util.Scanner;
public class KilometersToMilesAdvance{
	public static void main(String[] args){
		//Declaring km variable which contains the kilometer		
		double km;

		// Creating an instance of Scanner class
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the kilometer :- ");	
	
		//Taking input from the user
		km = input.nextDouble();
		
		//Converting km into miles
		double miles = km * 1.6;


		// Display the distance in miles
		System.out.print("The total miles is "+ miles +" mile for the given " + km +" km");
	}
	
}