import java.util.Scanner;
public class HeightConversion{
	public static void main(String[] args){
		double heightInCm, heightInInches, heightInFeets;
		// Creating an instance of Scanner class
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your height in cm :- ");
		heightInCm = input.nextDouble();
		
		//Converting height in inches
		heightInInches = heightInCm / 2.54;
		
		//converting Height in feets
		heightInFeets = heightInInches / 12;

		System.out.print("Your Height in cm is " + heightInCm + " while in feet is " + heightInFeets + " and inches is " + heightInInches);
	}
	
}