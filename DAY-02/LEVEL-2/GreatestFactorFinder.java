import java.util.Scanner;

public class GreatestFactorFinder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Get input from user

        System.out.print("Enter number: ");

        int number = scanner.nextInt();

        // Initialize the greatestFactor variable to 1
        int greatestFactor = 1;
		
        // Loop from number - 1 down to 1
        for (int i = number - 1; i >= 1; i--) {

            // Check if number is perfectly divisible by i
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }

        }
        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);

		//close the scanner class
        scanner.close();

    }

}