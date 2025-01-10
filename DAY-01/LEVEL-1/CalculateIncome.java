import java.util.Scanner;
public class CalculateIncome{
	public static void main(String[] args){
		//Declaring variables which contains salary, bonus and computed or final credit salary
		int salary , bonus, computedSalary;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the salary :- ");
		
		//Taking salary from the user
		salary = input.nextInt();
		
		System.out.print("Enter the bonus :- ");
		
		//Taking bonus from the user
		bonus = input.nextInt();
		
		//Calculating Toatal or credited salary after bonus
		computedSalary  = salary + bonus;
		
		//Display the information
		System.out.print("The salary is INR "+ salary +" and bonus is INR "+ bonus +". Hence Total Income is INR " + computedSalary);
		
		//close the scanner input
		input.close();
		
	}
	
}