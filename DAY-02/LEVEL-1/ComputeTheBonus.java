import java.util.Scanner;
public class ComputeTheBonus{
	public static void main(String[] args){
		//Declaring variables which contains user input
		int salary, yearsOfService;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
	
		// Get the salary from the user
		System.out.print("Enter the salary:- ");
		salary = input.nextInt();
		
		// Get the years of service from the user
		System.out.print("Enter the year of service:- ");
		yearsOfService = input.nextInt();
		
		//Compute the bonus amount
		int bonusOfEmployee = (salary * 5) / 100;
		
		// Checks is the employee is working more than 5 years or not
		if(yearsOfService > 5){
			System.out.println(bonusOfEmployee);
		}
		// if not more than 5 years than bonus is zero.
		else{
			System.out.println("No bonus for the employee");
		}

		//close the scanner input
		input.close();
	}
	
}
