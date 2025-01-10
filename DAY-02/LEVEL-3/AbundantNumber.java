import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        // Create a scanner class for input
        Scanner scanner = new Scanner(System.in);

        // Get user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize the sum variable to 0
        int sumOfDivisors = 0;

        // Loop through all integers
        for (int i = 1; i < number; i++) {
            // Check if the number is divisible by i
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        // Check if the number is harshad number or not
        if (sumOfDivisors > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }

        // Close the scanner
        scanner.close();
    }
}
