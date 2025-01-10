import java.util.Scanner;
public class CheckNumberIsGreatest{
	public static void main(String[] args){
		//Declaring variables which contains user values of three number
		int number1, number2, number3;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Number1 :- ");
		
		// Get input value for number1
		number1 = input.nextInt();

		System.out.print("Enter the Number2 :- ");
		
		// Get input value for number2
		number2 = input.nextInt();

		System.out.print("Enter the Number3 :- ");
		
		// Get input value for number3
		number3 = input.nextInt();
		
		// Condition to check the number1 is greatest among three or not
		if((number1 > number2) && (number1 > number3) ){
			System.out.println("Is the first number the largest? True");
		}else{
			System.out.println("Is the first number the largest? False");
		}
		
		// Condition to check the number2 is greatest among three or not
		if((number2 > number1) && (number2 > number3) ){
			System.out.println("Is the second number the largest? True");
		}else{
			System.out.println("Is the second number the largest? False");
		}
		
		// Condition to check the number3 is greatest among three or not
		if((number3 > number1) && (number3 > number2) ){
			System.out.println("Is the third number the largest? True");
		}else{
			System.out.println("Is the third number the largest? False");
		}
		
		
		
		
		//close the scanner input
		input.close();
		
	}
	
}