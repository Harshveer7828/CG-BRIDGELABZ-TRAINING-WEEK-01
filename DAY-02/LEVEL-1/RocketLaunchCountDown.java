import java.util.Scanner;
public class RocketLaunchCountDown{
	public static void main(String[] args){
		//Declaring variables which contains user input
		int counter;
		
		//Declaring scanner class instance 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the counter :- ");
		
		// Get input value of counter
		counter = input.nextInt();
		
		// Loop for countDown until counter is equal to 1
		while(counter >= 1){
			System.out.println(counter);
			
			// Decrease the counter after printing the counter value
			counter--;
		}
		
		
		
		
		//close the scanner input
		input.close();
		
	}
	
}