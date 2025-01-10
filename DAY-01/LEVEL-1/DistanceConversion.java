import java.util.Scanner;
public class DistanceConversion{
	public static void main(String[] args){
		//Declaring variables which contains perimeter and the side of the square
		float distanceInFeet, distanceInYards,distanceInMiles;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the distance in feets :- ");
		
		//Taking distance input from the user
		distanceInFeet = input.nextFloat();
		
		
		//Calculating the distanceInMiles
		distanceInYards = distanceInFeet / 3; 
		
		//Calculating the distanceInYards
		distanceInMiles = distanceInYards /1760;
		
		//Display the information
		System.out.print("Distance in feet "+distanceInFeet+ " distance in yards "+distanceInYards+" distanceInMiles is "+distanceInMiles);
		
		//close the scanner input
		input.close();
		
	}
	
}