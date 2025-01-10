import java.util.Scanner;
public class ConversionKgToPounds{
	public static void main(String[] args){
		//Declaring variables which contains weight in kilogram
		int weightInKilogram;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the weight in kilogram :- ");
		
		//Taking weight in kilogram from the user
		weightInKilogram = input.nextInt();

		//converting the weight in kg to pounds
		double weightInPounds = weightInKilogram * 2.2;
		
		//Display the information
		System.out.print(" The weight of the person in pound is " + weightInPounds + " and in kg is "+ weightInKilogram);
		
		//close the scanner input
		input.close();
		
	}
	
}