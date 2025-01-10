import java.util.Scanner;
public class DiscountedCollegeFeeAdvance{
	public static void main(String[] args){
		//Declaring  variable which contains student fee and discount percentage	
		int studentFee , discountPercent;

		// Creating an instance of Scanner class
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the Student Fee :- ");	
	
		// Taking input from user and store in studentFee variable
		studentFee = input.nextInt();

		System.out.print("Enter the discount percentage :- ");

		// Taking input from user and store in studentFee variable
		discountPercent = input.nextInt();		
			
		//Calculating the discount amount
		int discountAmount = (studentFee*discountPercent)/100;
		
		//Calculating the fee after discount
		int discountedFee = studentFee - discountAmount;

		//Display the profit and profit percentage 
		System.out.print("The discount amount is INR " + discountAmount +  " and final discounted fee is INR " + discountedFee);
	}
	
} 