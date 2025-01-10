import java.util.Scanner;
public class ChocolateDistribution{
	public static void main(String[] args){
		//Declaring variable which contains number of students and number of chocolates
		int numberOfChildren , numberOfchocolates ;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of childrens :- ");
		
		//Taking number of childrens from the user
		numberOfChildren = input.nextInt();
		
		System.out.print("Enter the numberOfchocolates :- ");
		
		//Taking number of chocolates from the user
		numberOfchocolates = input.nextInt();

		//Computing the number of chocolates each children gets
		int ChocolateEachChildGet = numberOfchocolates / numberOfChildren;
		
		//number of chocolates left after distribution
		int chocolatesLeft = numberOfchocolates % numberOfChildren;
		
		
		//Display the information
		System.out.print("The number of chocolates each child gets is " + ChocolateEachChildGet +" and the number of remaining chocolates are "+ chocolatesLeft);
		
		//close the scanner input
		input.close();
		
	}
	
}