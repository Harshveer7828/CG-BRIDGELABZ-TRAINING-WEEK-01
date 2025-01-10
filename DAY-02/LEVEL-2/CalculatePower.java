import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args) {
		//Declare variable to store user number input
		int number, power;
	
		//Declaring scanner class
        Scanner input = new Scanner(System.in);
        
        // Get input from the user
        System.out.print("Enter the base number: ");
        number = input.nextInt();
        
        // Get power as input from user
        System.out.print("Enter the power: ");
        power = input.nextInt();
        
        // Initialize the result variable to 1
        int result = 1;
        
        // Loop from 1 to power
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Print the result
        System.out.println("Power "+ power + " of "+ number + " is " +result);
        
		//Close the scanner class
        input.close();
    }
}