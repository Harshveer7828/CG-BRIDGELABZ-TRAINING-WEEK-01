import java.util.Scanner;
public class CheckAgeToVote{
	public static void main(String[] args){
		//Declaring variables which contains user age
		int ageOfPerson;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the age of person :- ");
		
		// Get input value for age
		ageOfPerson = input.nextInt();

		// Condition to if the user input is valid or not
		if(ageOfPerson < 0){
			System.out.print("Invalid age Input");
		}
		
		// Condition to check the person is eligible to vote or not
		else if(ageOfPerson >= 18 ){
			System.out.print("The person's age is "+ ageOfPerson +" and can vote.");
		}
		
		else{
			System.out.print("The person's age is " + ageOfPerson + " and cannot vote.");
		}
		
		
		
		
		//close the scanner input
		input.close();
		
	}
	
}