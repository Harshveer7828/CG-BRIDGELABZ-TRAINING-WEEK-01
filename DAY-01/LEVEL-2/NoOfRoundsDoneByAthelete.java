import java.util.Scanner;
public class NoOfRoundsDoneByAthelete{
	public static void main(String[] args){
		//Declaring variable which contains the distace of all the side of the park
		int side1, side2, side3;
		
		//distance covered by athelete
		int distaceCovered = 5;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the distance of side1 :- ");
		
		//Taking distace of side1 from the user
		side1 = input.nextInt();
		
		System.out.print("Enter the distace of side2 :- ");
		
		//Taking side2 distace from the user
		side2 = input.nextInt();
		
		System.out.print("Enter the distace of side3 :- ");
		
		//Taking side3 distace from the user
		side3 = input.nextInt();
		
		//computes the perimeter of the park
		int perimeterOfPark = side1 + side2 + side3;
		
		// Computing the number of rounds athelete do
		int NumberOfRound = distaceCovered / perimeterOfPark;
		
		
		//Display the information
		System.out.print(" The total number of rounds the athlete will run is " + NumberOfRound +" to complete " + distaceCovered);
		
		//close the scanner input
		input.close();
		
	}
	
}