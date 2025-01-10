import java.util.Scanner;
public class CalculateTheTotalAmount{
	public static void main(String[] args){
		//Declaring variables which contains perimeter and the side of the square
		float unitPrice, quantityBought;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the unit price of an item :- ");
		
		//Taking unitPrice from the user
		unitPrice = input.nextFloat();
		
		System.out.print("Enter the quatity of an item :- ");
		
		//Taking quantityBought from the user
		quantityBought = input.nextFloat();
		
		//Calculating toatal amount of the user
		float totalAmount = unitPrice * quantityBought;
		
		//Display the information
		System.out.print("The total purchase price is INR "+ totalAmount +" if the quantity "+quantityBought+" and unit price is INR "+unitPrice);
		
		//close the scanner input
		input.close();
		
	}
	
}